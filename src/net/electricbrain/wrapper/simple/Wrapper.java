package net.electricbrain.wrapper.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 28.05.17
 */

// The Main: Wrapper implements the same interface!
class Wrapper implements Counter {
    private CounterImpl counterImpl;

    Wrapper () {
        counterImpl = new CounterImpl ();
    }

    @Override
    public void increase() {
        counterImpl.increase();
    }

    @Override
    public void show () {
        System.out.println ("--- I am wrapper! --- ");
        counterImpl.show();
        System.out.println ("---------------------");
    }
}
