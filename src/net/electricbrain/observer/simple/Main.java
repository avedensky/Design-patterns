package net.electricbrain.observer.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 13.06.17
 */
public class Main {
    public static void main(String[] args) {
        PurchasersImpl purchasers = new PurchasersImpl();
        purchasers.registrPurchaser(new Alex());
        purchasers.registrPurchaser(new Mike());
        purchasers.registrPurchaser(new Alice());

        System.out.println("Our Company changed price, our subscribers can see this");
        purchasers.setPrice(100);
        System.out.println("\nOur Company changed price, our subscribers can see this");
        purchasers.setPrice(200);

    }
}
