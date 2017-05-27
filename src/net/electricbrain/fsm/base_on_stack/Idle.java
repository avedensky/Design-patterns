package net.electricbrain.fsm.base_on_stack;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 27.05.17
 */

public class Idle implements State<Hero> {
    @Override
    public void enter(Hero hero) {
        System.out.println("ENTER TO STATE IDLE: Go with me to idle state");
    }

    @Override
    public void execute(Hero hero) {
        System.out.println("EXECUTE STATE IDLE: Idle, Idle");
        hero.popState();
        State<Hero> moveState = new Move();
        hero.pushState(moveState);
    }

    @Override
    public void exit(Hero hero) {
        System.out.println("EXIT FROM STATE MOVE: Exit from idle state");
    }
}
