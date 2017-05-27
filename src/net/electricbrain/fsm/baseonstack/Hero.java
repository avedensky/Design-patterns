package net.electricbrain.fsm.baseonstack;

import java.util.LinkedList;

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
