package net.electricbrain.fsm.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 26.05.17
 */

class Move implements State {

    @Override
    public void nextState (Actor actor) {
        System.out.println("I'am moving.");
        actor.setState(((Hero)actor).idle);
    }
}
