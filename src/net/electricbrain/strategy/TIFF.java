package net.electricbrain.strategy;

/**
 * Created by alexey on 14.06.17.
 */
public class TIFF implements Strategy {
    private String algoritmName = "TIFF";

    @Override
    public void convert(String src, String dst) {
        System.out.printf("Convert '%s' to '%s' in %s format\n", src, dst, algoritmName);
    }
}
