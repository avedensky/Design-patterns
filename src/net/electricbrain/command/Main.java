package net.electricbrain.command;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 07.06.17
 */
public class Main {
    public static void main(String[] args) {
        Command sit = new Sit();
        Command down = new Down();
        Command stand = new Stand();
        Command heel = new Heel ();

        Dog dog = new Dog ();

        dog.executeCommand(sit);
        dog.executeCommand(down);
        dog.executeCommand(stand);
        dog.executeCommand(heel);
    }

}
