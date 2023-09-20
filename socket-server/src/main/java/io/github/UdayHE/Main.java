package io.github.UdayHE;

import io.github.UdayHE.server.SocketServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SocketServer server = new SocketServer();
        server.start(6666);
    }
}