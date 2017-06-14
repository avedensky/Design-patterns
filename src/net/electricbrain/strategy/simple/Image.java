package net.electricbrain.strategy.simple;

/**
 * Created by alexey on 14.06.17.
 */
public class Image {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void convert (String src, String dst) {
        strategy.convert(src, dst);
    }
}
