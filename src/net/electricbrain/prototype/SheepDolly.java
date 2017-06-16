package net.electricbrain.prototype;

/**
 * Created by alexey on 16.06.17.
 */
public class SheepDolly extends Sheep { //Concrete prototype
    public SheepDolly() {
        name = "Dolly";
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (SheepDolly) super.clone();
    }
}
