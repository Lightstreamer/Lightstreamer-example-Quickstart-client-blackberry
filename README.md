# Lightstreamer - Tester - BlackBerry Client #
<!-- START DESCRIPTION lightstreamer-example-tester-client-blackberry -->

This example, called "test", is not made for running on real devices, since its output is written on the console. Moreover nothing is displayed on the display.
You can use the provided source code as a starting point to familiarize with the [Lightstreamer BlackBerry Client API](http://www.lightstreamer.com/docs/client_blackberry_api/index.html).

<!-- END DESCRIPTION lightstreamer-example-tester-client-blackberry -->

Check out the sources for further explanations. 

# Build #

This example is comprised of the following folders:
* /src<br>
  Contains the sources to build the java application.
  
* /lib<br>
  Drop here the ls-bb-client.jar from the Lighstreamer SDK for BlackBerry Clients, to be used for the build process and execution.

# Deploy #
  
By the current configuration, specified in "/src/javametest/tester.java", the demo tries to connect to a local installation of Lightstreamer Server. If needed, the host name, the port number, the Adapter Set name and the Data Adapter
name could be changed in the source code.<br>
The demo is suitable for running with the [QUOTE_ADAPTER](https://github.com/Weswit/Lightstreamer-example-Stocklist-adapter-java), [PORTFOLIO_ADAPTER](https://github.com/Weswit/Lightstreamer-example-Portfolio-adapter-java) and [CHAT_ROOM](https://github.com/Weswit/Lightstreamer-example-Chat-adapter-java) Data Adapters.

# See Also #

## Lightstreamer Adapters Needed by This Demo Client ##
<!-- START RELATED_ENTRIES -->

* [Lightstreamer - Stock-List Demo - Java Adapter](https://github.com/Weswit/Lightstreamer-example-Stocklist-adapter-java)
* [Lightstreamer - Portfolio Demo - Java Adapter](https://github.com/Weswit/Lightstreamer-example-Portfolio-adapter-java)
* [Lightstreamer - Basic Chat Demo - Java Adapter](https://github.com/Weswit/Lightstreamer-example-Chat-adapter-java)
* [Lightstreamer - Reusable Metadata Adapters - Java Adapter](https://github.com/Weswit/Lightstreamer-example-ReusableMetadata-adapter-java)

<!-- END RELATED_ENTRIES -->

## Related Projects ##

* [Lightstreamer - Basic Stock-List and Round-Trip Demo - BlackBerry Client](https://github.com/Weswit/Lightstreamer-example-StockList-client-blackberry)

# Lightstreamer Compatibility Notes #

- Compatible with Lightstreamer BlackBerry Client API v. 1.1.1 or newer.
- For Lightstreamer Allegro (+ BlackBerry Client API support), Presto, Vivace.
