package net.electricbrain.fsm.variant1;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 26.05.17
 */

class Actor {
    protected State currentState;

    public void nextState () {
        currentState.nextState (this);
    }

    public void setState (State state) {
        currentState = state;
    }
}
