package net.electricbrain.adapter.class_adapter;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 24.05.17
 */
interface TrueInterface {
    int generateValue();
}

class A implements TrueInterface {
    private int value;

    public A() {
        value = 2;
    }

    @Override
    public int generateValue() {
        return value += 3;
    }
}


class B {
    private int value;

    public B() {
        value = 10;
    }

    public int foo() {
        return value += 10;
    }

}


class Adapter extends B implements TrueInterface {

    Adapter () {
        super();
    }

    @Override
    public int generateValue() {
        return foo();
    }
}


class HowItWorksThis {
    public static void main(String[] args) {
        A a = new A();

        System.out.println("Print A");
        printTrueInterfaceObjectOnly (a);
        System.out.println();

        B b = new B();
        System.out.println("Print B");
        printTrueInterfaceObjectOnly (new Adapter());
    }

    public static void printTrueInterfaceObjectOnly (TrueInterface obj) {
        System.out.println(obj.generateValue());
    }
}
