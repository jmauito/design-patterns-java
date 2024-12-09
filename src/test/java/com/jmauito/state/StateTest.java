package com.jmauito.state;

import com.jmauito.state.tcp.State;
import com.jmauito.state.tcp.TCPConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateTest {
    @Test
    public void shouldStateChangeToClosedWhenATCPConnectionIsCreated()
    {
        State initialState = State.CLOSED;
        TCPConnection connection = new TCPConnection();
        assertEquals(initialState, connection.getState());
    }

    @Test
    public void shouldStateChangeToReadyWhenOpenMethodIsCalled()
    {
        State initialState = State.READY;
        TCPConnection connection = new TCPConnection();
        connection.open();
        assertEquals(initialState, connection.getState());
    }

    @Test
    public void shouldStateChangeToWaitingWhenSubmitMethodIsCalled()
    {
        State initialState = State.WAITING;
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.submit();
        assertEquals(initialState, connection.getState());
    }

    @Test
    public void shouldStateChangeToReadyWhenMessageIsReceived()
    {
        State initialState = State.READY;
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.submit();
        connection.receive(0);
        assertEquals(initialState, connection.getState());
    }

    @Test
    public void shouldStateChangeToReadyWhenMessageIsFullyReceived()
    {
        State initialState = State.CLOSED;
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.submit();
        connection.receive(1);
        assertEquals(initialState, connection.getState());
    }

    @Test
    public void shouldStateChangeToCloseWhenCloseMethodIsCalled()
    {
        State initialState = State.CLOSED;
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.close();
        assertEquals(initialState, connection.getState());
    }

    @Test
    public void shouldStateChangeToStopWhenStopMethodIsCalled()
    {
        State initialState = State.STOPPED;
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.stop();
        assertEquals(initialState, connection.getState());
    }

    @Test
    public void shouldStateChangeToReadyWhenStartMethodIsCalled()
    {
        State initialState = State.READY;
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.stop();
        connection.start();
        assertEquals(initialState, connection.getState());
    }


}
