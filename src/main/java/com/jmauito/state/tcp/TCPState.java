package com.jmauito.state.tcp;

public abstract class TCPState {
    private static final String UNSUPPORTED = "Acción no permitida";

    public abstract State getState();
    public void open(TCPConnection tcpConnection) { throw new RuntimeException(UNSUPPORTED); }
    public void start(TCPConnection tcpConnection) { throw new RuntimeException(UNSUPPORTED); }
    public void submit(TCPConnection tcpConnection, String message) { throw new RuntimeException(UNSUPPORTED); }
    public void receive(TCPConnection tcpConnection, int response) { throw new RuntimeException(UNSUPPORTED); }
    public void stop(TCPConnection tcpConnection) { throw new RuntimeException(UNSUPPORTED); }
    public void close(TCPConnection tcpConnection) { throw new RuntimeException(UNSUPPORTED); }
}
