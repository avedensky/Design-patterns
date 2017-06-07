package net.electricbrain.command;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 07.06.17
 */
public class Sit implements Command {
    @Override
    public void execute() {
        System.out.println("is siting");
    }
}
