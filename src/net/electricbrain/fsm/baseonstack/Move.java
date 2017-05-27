package net.electricbrain.fsm.baseonstack;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 27.05.17
 */

public class Move implements State <Hero> {
    private int step = 0;

    @Override
    public void enter(Hero hero) {
        System.out.println("ENTER TO STATE MOVE: Oh, I need to move!");
    }

    @Override
    public void execute(Hero hero) {
        System.out.println("EXECUTE STATE MOVE: step by step, step by step, I am moving");
        if (step>2) {
            hero.popState();
            hero.pushState(new Idle());
        }
        step++;
    }

    @Override
    public void exit(Hero hero) {
        System.out.println("EXIT FROM STATE MOVE: I am tired. Stay here.");
    }
}
