package net.electricbrain.fsm.base_on_stack;

import java.util.LinkedList;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 27.05.17
 */

/**
 * Simple Finite State Machine (FSM) base on stack (aka LinkedList)
 */
public class Entity {
    protected LinkedList<State> states;

    public Entity () {
        this.states = new LinkedList<>();
    }

    /**
     * Call exit method from current state
     * Remove first current state
     */
    public void popState() {
        if (states.size()>0)
            states.pop().exit(this);
    }

    /**
     * Set new state as current
     * Call enter method from new state
     * @param state
     */
    public void pushState(State state) {
        states.push(state);
        state.enter(this);
    }

    /**
     * Every time call method update from current state
     */
    protected void update () {
        states.getFirst().execute(this);
    }
}
