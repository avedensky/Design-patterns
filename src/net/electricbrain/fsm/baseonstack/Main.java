package net.electricbrain.fsm.baseonstack;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 27.05.17
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        for (int i=0;i<15;i++)
            hero.update();
    }
}
