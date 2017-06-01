package net.electricbrain.facade.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 01.06.17
 */
public class CoffeeMachine {
    private ElectricPower electricPower;
    private GrindingMechanism grindingMechanism;
    private Trash trash;
    private WaterContainer waterContainer;

    public CoffeeMachine() {
        this.electricPower = new ElectricPower();
        this.grindingMechanism = new GrindingMechanism();
        this.trash = new Trash();
        this.waterContainer = new WaterContainer();
    }

    public void cookCoffee() {
        if (!electricPower.CheckPower())
            return;

        electricPower.powerButton();

        if (trash.isFull())
            System.out.println("Clean trash container!");

        if (!waterContainer.isWater())
            System.out.println("No Water, pour please!");

        grindingMechanism.grind();
        System.out.println("Your coffee, please.");
    }
}
