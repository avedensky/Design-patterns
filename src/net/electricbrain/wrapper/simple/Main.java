package net.electricbrain.wrapper.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 28.05.17
 */
public class Main {
    public static void main (String[] args) {
        CounterImpl counterImpl = new CounterImpl ();
        System.out.println ("Simple class CounterImpl");
        counterImpl.show ();
        counterImpl.increase ();
        counterImpl.show ();

        System.out.println ("");
        System.out.println ("");

        System.out.println ("Wrapped class CounterImpl by Wrapper :)");
        Wrapper wrapper = new Wrapper ();
        wrapper.show ();
        wrapper.increase();
        wrapper.show ();
    }
}
