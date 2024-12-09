package com.jmauito.state.tcp;

public class ClosedState extends TCPState {

    @Override
    public State getState() {
        return State.CLOSED;
    }

    @Override
    public void open(TCPConnection tcpConnection) {
        System.out.println("Opening connection...");
        tcpConnection.setState(new ReadyState());
    }

    @Override
    public void close(TCPConnection tcpConnection) {
        System.out.println("Connection is already closed.");
    }

}
