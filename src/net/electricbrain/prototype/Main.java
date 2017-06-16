package net.electricbrain.prototype;

/**
 * Created by alexey on 16.06.17.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep dolly = new SheepDolly ();
        dolly.whatsName();

        //new clone
        Sheep dolly2 = dolly.clone(); //dolly2 created base on prototype dolly
        dolly2.whatsName();

        System.out.println();
        System.out.println("Test change name and now:");
        dolly.setName("Barby");
        dolly.whatsName();
        dolly2.whatsName();
    }
}
