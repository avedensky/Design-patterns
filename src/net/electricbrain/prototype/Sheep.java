package net.electricbrain.prototype;

/**
 * Created by alexey on 16.06.17.
 */
public class Sheep implements Cloneable { //Base class prototype
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

    public void whatsName() {
        System.out.println(this.getClass().getSimpleName()+" "+name);
    }
}
