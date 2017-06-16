package net.electricbrain.strategy;

/**
 * Created by alexey on 14.06.17.
 */
public class Main {
    public static void main(String[] args) {
        Image img = new Image();

        img.setStrategy(new JPG());
        img.convert("photo","converted_photo");

        img.setStrategy(new TIFF());
        img.convert("photo","converted_photo");

        img.setStrategy(new PNG());
        img.convert("photo","converted_photo");
    }
}
