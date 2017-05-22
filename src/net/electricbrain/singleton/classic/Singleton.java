package net.electricbrain.singleton.classic;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 22.05.17
 */

//Classic variant, do not use in Multi Threading
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class HowItWorksThis {
    public static void main(String[] args) {
        System.out.println("CLASSIC Singleton");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
