package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.SimpleFileServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Path;

public class SimpleWebserverTest {

    //template key: sws

    public static void main(String[] args) throws Exception {
        new SimpleWebserverTest().startFileServer();
    }
    void startFileServer() {
        var path = getClass().getResource(".").getPath();

        //hack specifically for Windows
        if (path.startsWith("/") && path.charAt(2) == ':') {
            path = path.substring(1); // Remove leading slash for Windows compatibility
        }

        var server = SimpleFileServer.createFileServer(new InetSocketAddress(8080),
                Path.of(path),
                SimpleFileServer.OutputLevel.VERBOSE);
        server.createContext("/custom", new MyHttpHandler());
        server.start();
    }
}

class MyHttpHandler implements com.sun.net.httpserver.HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("GET".equals(exchange.getRequestMethod())) {
            OutputStream outputStream = exchange.getResponseBody();
            String response = "It works!";
            exchange.sendResponseHeaders(200, response.length());
            outputStream.write(response.getBytes());
            outputStream.flush();
            outputStream.close();
        }
    }
}
