package com.jmauito.state.tcp;

public class TCPConnection {
    private TCPState state;

    public TCPConnection()
    {
        setState(new ClosedState());
    }

    protected void setState(TCPState state)
    {
        this.state = state;
    }

    public State getState()
    {
        return state.getState();
    }

    public void open() {
        state.open(this);
    }
    public void start() {
        state.start(this);
    }
    public void submit() {
        state.submit(this, "{id:1, name:Juan}");
    }
    public void receive(int value) {
        state.receive(this, value);
    }
    public void stop() {
        state.stop(this);
    }
    public void close() {
        state.close(this);
    }
}
