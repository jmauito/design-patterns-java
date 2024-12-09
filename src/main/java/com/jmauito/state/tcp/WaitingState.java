package com.jmauito.state.tcp;

public class WaitingState extends TCPState{
    @Override
    public State getState() {
        return State.WAITING;
    }

    @Override
    public void receive(TCPConnection tcpConnection, int value) {
        if(value > 0) {
            System.out.println("Message received. Closing connection");
            tcpConnection.setState(new ClosedState());
        } else {
            System.out.println("Receiving message...");
            tcpConnection.setState(new ReadyState());
        }
    }
}
