package com.jmauito.state.app;

import com.jmauito.state.tcp.TCPConnection;

public class Main {
    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();
        System.out.println("Connection created");
        System.out.println("Current state: " + tcpConnection.getState());

        tcpConnection.open();
        System.out.println("Current state: " + tcpConnection.getState());

        tcpConnection.start();
        System.out.println("Current state: " + tcpConnection.getState());

        tcpConnection.submit();
        System.out.println("Current state: " + tcpConnection.getState());

        tcpConnection.receive(0);
        System.out.println("Current state: " + tcpConnection.getState());

        tcpConnection.stop();
        System.out.println("Current state: " + tcpConnection.getState());

        tcpConnection.start();
        System.out.println("Current state: " + tcpConnection.getState());

        tcpConnection.submit();
        System.out.println("Current state: " + tcpConnection.getState());

        tcpConnection.receive(1);
        System.out.println("Current state: " + tcpConnection.getState());

		tcpConnection.close();
    }
}
