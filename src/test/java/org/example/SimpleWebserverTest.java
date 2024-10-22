package org.example;

import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetSocketAddress;
import java.nio.file.Path;

public class SimpleWebserverTest {

    public static void main(String[] args) throws Exception {
        new SimpleWebserverTest().startFileServer();
    }
    void startFileServer() {
        var path = getClass().getResource(".").getPath();
        var server = SimpleFileServer.createFileServer(new InetSocketAddress(8080),
                Path.of(path),
                SimpleFileServer.OutputLevel.VERBOSE);
        server.start();
    }
}
