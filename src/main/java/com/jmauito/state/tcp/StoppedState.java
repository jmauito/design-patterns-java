package com.jmauito.state.tcp;

public class StoppedState extends TCPState{
    @Override
    public State getState() {
        return State.STOPPED;
    }

    @Override
    public void start(TCPConnection tcpConnection) {
        System.out.println("Starting connection...");
        tcpConnection.setState(new ReadyState());
    }

    @Override
    public void stop(TCPConnection tcpConnection) {
        System.out.println("Connection is already stopped.");
    }
}
