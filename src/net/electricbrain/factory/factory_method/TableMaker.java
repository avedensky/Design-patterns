package net.electricbrain.factory.factory_method;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 12.06.17
 */
public class TableMaker extends FurnitureMaker {

    @Override
    public Furniture make() {
        return new Table();
    }
}
