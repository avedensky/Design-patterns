package net.electricbrain.observer.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 13.06.17
 */
public class Mike implements Purchaser {

    @Override
    public void updatePrice(int newPrice) {
        System.out.println("Mike say: O, I geted new price:" + newPrice);
    }
}
