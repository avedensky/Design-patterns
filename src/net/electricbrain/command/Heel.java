package net.electricbrain.command;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 07.06.17
 */
public class Heel implements Command {
    @Override
    public void exexute() {
        System.out.println("is heeling");
    }
}
