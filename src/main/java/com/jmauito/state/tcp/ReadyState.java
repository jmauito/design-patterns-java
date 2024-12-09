package com.jmauito.state.tcp;

public class ReadyState extends TCPState{

    @Override
    public State getState() {
        return State.READY;
    }

    @Override
    public void open(TCPConnection tcpConnection) {
        System.out.println("Connection is already open.");
    }

    @Override
    public void start(TCPConnection tcpConnection) {

        System.out.println("Starting...");
    }

    @Override
    public void submit(TCPConnection tcpConnection, String message) {
        System.out.println("Sending message " + message + " ...");
        tcpConnection.setState(new WaitingState());
    }

    @Override
    public void stop(TCPConnection tcpConnection) {
        System.out.println("Stopping...");
        tcpConnection.setState(new StoppedState());
    }

    @Override
    public void close(TCPConnection tcpConnection) {
        System.out.println("Closing connection....");
        tcpConnection.setState(new ClosedState());
    }

}
