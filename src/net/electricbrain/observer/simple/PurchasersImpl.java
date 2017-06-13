package net.electricbrain.observer.simple;

import java.util.ArrayList;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 13.06.17
 */
public class PurchasersImpl implements Purchasers {
    private ArrayList<Purchaser> purchasers;
    private int price;

    public PurchasersImpl() {
        this.purchasers = new ArrayList<>();
    }

    @Override
    public void registrPurchaser(Purchaser purchaser) {
        purchasers.add(purchaser);

    }

    @Override
    public void removePurchaser(Purchaser purchaser) {
        purchasers.remove(purchaser);

    }

    @Override
    public void notifyPurchaser() {
        for (Purchaser purchaser: purchasers) {
            purchaser.updatePrice(price);
        }
    }

    public void setPrice(int price) {
        this.price = price;
        notifyPurchaser();
    }
}
