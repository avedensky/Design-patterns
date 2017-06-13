package net.electricbrain.observer.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 13.06.17
 */
public class Alex implements Purchaser {

    @Override
    public void updatePrice(int newPrice) {
        System.out.println("Alex say: O, I geted new price:" + newPrice);
    }
}
