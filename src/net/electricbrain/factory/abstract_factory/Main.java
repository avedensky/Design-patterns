package net.electricbrain.factory.abstract_factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexey on 15.06.17.
 */
public class Main {
    public static void main(String[] args) {
        FurnitureFactory antiqueFurnitureFactory = new AntiqueFurnitureFabric();
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFabric();

        List<Furniture> furnitures = new ArrayList<>();

        //create and add to lis antique furniture
        furnitures.add(antiqueFurnitureFactory.createChair());
        furnitures.add(antiqueFurnitureFactory.createTable());

        //create and add to lis modern furniture
        furnitures.add(modernFurnitureFactory.createChair());
        furnitures.add(modernFurnitureFactory.createTable());

        for (Furniture furniture : furnitures)
            furniture.info();
    }
}
