package net.electricbrain.factory.abstract_factory;

/**
 * Created by alexey on 15.06.17.
 */
public class AntiqueFurnitureFabric implements FurnitureFactory{

    @Override
    public Furniture createChair() {
        return new AntiqueChair();
    }

    @Override
    public Furniture createTable() {
        return new AntiqueTable ();

    }
}
