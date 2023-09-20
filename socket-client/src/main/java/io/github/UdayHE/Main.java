package io.github.UdayHE;

import io.github.UdayHE.client.SocketClient;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SocketClient client = new SocketClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        System.out.println(response);
    }
}