package net.electricbrain.fsm.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 26.05.17
 */
class Eat implements State {

    @Override
    public void nextState (Actor actor) {
        System.out.println("I'am eating.");
    }
}