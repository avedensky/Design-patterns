package net.electricbrain.factory.abstract_factory;

/**
 * Created by alexey on 15.06.17.
 */
public class ModernFurnitureFabric implements FurnitureFactory {
    @Override
    public Furniture createChair() {
        return new ModernChair();
    }

    @Override
    public Furniture createTable() {
        return new ModernTable();
    }
}
