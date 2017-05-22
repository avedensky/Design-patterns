package net.electricbrain.singleton.multi_thread_2;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 22.05.17
 */

//Best of MultiThreading solution
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class HowItWorksThis {
    public static void main(String[] args) {
        System.out.println("Best for Multithreding Singleton");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}

