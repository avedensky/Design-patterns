package net.electricbrain.observer;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 13.06.17
 */
public class Alice implements Purchaser {

    @Override
    public void updatePrice(int newPrice) {
        System.out.println("Alice say: O, I geted new price:" + newPrice);
    }
}
