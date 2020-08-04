# Lightstreamer - Quickstart Example - BlackBerry Client #
<!-- START DESCRIPTION lightstreamer-example-quickstart-client-blackberry -->

The *Quickstart Example* provides the source code to build very simple and basic client applications, used to test the capability of the Client APIs to connect and receive data from Lightstreamer Server. The examples can be used to familiarize with the Client APIs and as a reference on how to use them, and can be used as a starting point for client application implementations.

This project contains the source files of a sample application that shows how the [Lightstreamer BlackBerry Client API](https://lightstreamer.com/api/ls-blackberry-client/latest/index.html) can be used to connect to Lightstreamer Server.

## Details

These examples, called "Tester" and "DistictTester", are not made for running on real devices, because the output is written on the console. Moreover, nothing is displayed on the display.

<!-- END DESCRIPTION lightstreamer-example-quickstart-client-blackberry -->

By the current configuration, specified in `/src/javametest/Tester.java` and in `/src/javametest/DistinctTester.java`, the demos try to connect to a local installation of Lightstreamer Server. If needed, the host name, port number, Adapter Set name, and Data Adapter name could be changed in the source code.

The demos are suitable for running with the [QUOTE_ADAPTER](https://github.com/Lightstreamer/Lightstreamer-example-Stocklist-adapter-java), [PORTFOLIO_ADAPTER](https://github.com/Lightstreamer/Lightstreamer-example-Portfolio-adapter-java), and [CHAT_ROOM](https://github.com/Lightstreamer/Lightstreamer-example-Chat-adapter-java) Data Adapters.

Check out the sources code for further explanations. 

## Build

To build and install a version of this demo, pointing to your local Lightstreamer Server instance, follow the steps below.

* The `Tester` class, needs both the *PORTFOLIO_ADAPTER* (see [Lightstreamer - Portfolio Demo - Java Adapter](https://github.com/Lightstreamer/Lightstreamer-example-Portfolio-adapter-java)), and the *QUOTE_ADAPTER* (see [Lightstreamer - Stock-List Demo - Java Adapter](https://github.com/Lightstreamer/Lightstreamer-example-StockList-adapter-java)). Therefore, as a prerequisite, the full version of the [Lightstreamer - Portfolio Demo - Java Adapter](https://github.com/Lightstreamer/Lightstreamer-example-Portfolio-adapter-java) has to be deployed on your local Lightstreamer Server instance. Please follow the instruction in [Install the Portfolio Demo](https://github.com/Lightstreamer/Lightstreamer-example-Portfolio-adapter-java#install-the-portfolio-demo) to install it.
* The `DistinctTester` class needs the *CHAT_ROOM* Adapter, therefore, as a prerequisite, the [Lightstreamer - Basic Chat Demo - Java Adapter](https://github.com/Lightstreamer/Lightstreamer-example-Chat-adapter-java) has to be deployed on your local Lightstreamer Server instance.
* Download the latest `ls-bb-client.jar` file from the [Lightstreamer BlackBerry Client SDK resources](https://lightstreamer.com/res/ls-blackberry-client/latest/usage.html) into the `lib` directory of the project.
* Build the `Tester.java` and the `DistinctTester.java` classes

## See Also

### Lightstreamer Adapters Needed by This Client
<!-- START RELATED_ENTRIES -->

* [Lightstreamer - Stock-List Demo - Java Adapter](https://github.com/Lightstreamer/Lightstreamer-example-Stocklist-adapter-java)
* [Lightstreamer - Portfolio Demo - Java Adapter](https://github.com/Lightstreamer/Lightstreamer-example-Portfolio-adapter-java)
* [Lightstreamer - Basic Chat Demo - Java Adapter](https://github.com/Lightstreamer/Lightstreamer-example-Chat-adapter-java)
* [Lightstreamer - Reusable Metadata Adapters - Java Adapter](https://github.com/Lightstreamer/Lightstreamer-example-ReusableMetadata-adapter-java)

<!-- END RELATED_ENTRIES -->

### Related Projects

* [Lightstreamer - Basic Stock-List and Round-Trip Demo - BlackBerry Client](https://github.com/Lightstreamer/Lightstreamer-example-StockList-client-blackberry)

## Lightstreamer Compatibility Notes

- Compatible with Lightstreamer BlackBerry Client API v. 1.1.1 or newer.
- Ensure that BlackBerry Client API is supported by Lightstreamer Server license configuration.
