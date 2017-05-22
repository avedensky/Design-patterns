package net.electricbrain.singleton.multi_thread_1;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 22.05.17
 */

//Normal, it works with Multithreads

//Load by classloader
//Can't exception cultivated
class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton () {}

    public static Singleton getInstance () {
        return singleton;
    }
}

class HowItWorksThis {
    public static void main(String[] args) {
      System.out.println("\"Static\" Singleton");
      Singleton singleton1 = Singleton.getInstance();
      Singleton singleton2 = Singleton.getInstance();
      System.out.println(singleton1);
      System.out.println(singleton2);
    }
}
