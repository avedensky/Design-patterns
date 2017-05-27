package net.electricbrain.fsm.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 26.05.17
 *
 * Sample of finite state machine
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero ();
        hero.go ();
        hero.go ();
        hero.go ();
    }
}
