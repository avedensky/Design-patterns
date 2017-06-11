package net.electricbrain.factory.factory_method;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 12.06.17
 */
public class ChairMaker extends FurnitureMaker {

    @Override
    public Furniture make() { //Concrete fabric method for Chair production
        return new Chair();
    }
}
