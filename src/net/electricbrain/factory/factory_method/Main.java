package net.electricbrain.factory.factory_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 12.06.17
 */
public class Main {
    public static void main(String[] args) {
        List<FurnitureMaker> makers = new ArrayList<>();
        makers.add(new TableMaker());
        makers.add(new ChairMaker());

        for (FurnitureMaker maker : makers) {
            Furniture furniture = maker.make(); //Call Fabric method
        }
    }

}
