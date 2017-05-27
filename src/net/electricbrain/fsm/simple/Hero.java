package net.electricbrain.fsm.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 26.05.17
 */
class Hero extends Actor{

    public State idle;
    public State move;
    public State eat;

    public Hero () {
        this.idle = new Idle();
        this.move = new Move();
        this.eat  = new Eat();
        this.currentState = idle;
    }

    public void go () {
        currentState.nextState(this);
    }
}