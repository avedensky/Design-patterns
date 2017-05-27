package net.electricbrain.fsm.base_on_stack;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 27.05.17
 */
public class Hero extends Entity {
    public Hero () {
        states.push(new Idle());
    }
}
