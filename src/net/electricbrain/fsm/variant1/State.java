package net.electricbrain.fsm.variant1;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 26.05.17
 */
interface State {
    void nextState (Actor actor);
}
