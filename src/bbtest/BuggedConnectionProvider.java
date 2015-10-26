/*
 *
 * Copyright (c) Lightstreamer Srl
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
 
package bbtest;

import java.io.IOException;

import javax.microedition.io.Connection;
import javax.microedition.io.Connector;

import com.lightstreamer.javameclient.midp.ConnectionProvider;
import com.lightstreamer.javameclient.midp.logger.Logger;
import com.lightstreamer.javameclient.midp.logger.NumberedLogger;

public class BuggedConnectionProvider implements ConnectionProvider {

    private volatile static int fixed = 0;
    private static Object staticLock = new Object();
    private int count = 0;
    
    private static int handleId = 0;
    private NumberedLogger logger = Logger.getNumberedLogger("BuggedConnectionProvider",handleId++);

    public void setType(int type) {
        
    }

    public void rebuild() {
        logger.log("Rebuild");
        this.count = 0;
    }

    public void wasSuccessful() {
        logger.log("was succesfull: " + this.count);
        if (this.count > 0 && fixed <= 0) {
            synchronized(staticLock) {
                fixed = this.count;
            }
        }
    }

    public boolean hasConnections() {
        logger.log("has connections: " + this.count);
        return this.count < 4;
    }

    public Connection getNextConnection(String url, boolean secure)
            throws IOException {

        this.count++;
        
        logger.log("get next: " + this.count + " | " + fixed);
        
        int toSwitch = fixed>0 ? fixed : this.count;
        
        
        switch(toSwitch) {
            case 1:
                logger.log("simulated blocked call");
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                }
                logger.log("***********simulated blocked call RETURNS!");
                break;
            case 2:
                logger.log("null is returned");
                return null;
            case 3:
                logger.log("should work");
                return Connector.open(url);
            case 4:
                logger.log("null is returned v2");
                return null;
        }
        
        
        return null;
        
        
    }

    public Object clone() {
        return new BuggedConnectionProvider();
    }

}
