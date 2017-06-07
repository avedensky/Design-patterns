package net.electricbrain.command;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 07.06.17
 */
public class Dog {
    public void executeCommand (Command cmd) {
        System.out.print("Dog ");
        cmd.exexute();
    }
}
