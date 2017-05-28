package net.electricbrain.wrapper.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 28.05.17
 */
public class CounterImpl implements Counter {
    private int count;

    public CounterImpl () {
        this.count = 0;
    }

    @Override
    public void increase() {
        this.count++;
    }

    @Override
    public void show () {
        System.out.println ("Counter value:" + count);
    }
}
