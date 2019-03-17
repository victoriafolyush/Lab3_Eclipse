package ua.lviv.iot.SkiResortMachinery.managers;
import ua.lviv.iot.SkiResortMachinery.models.*;

public class Main {
    public static void main(String[] args) {
        SkiResortMachineryManager manager = new SkiResortMachineryManager();
        SkiResortMachinery snowGeneratorF43 = new SnowGenerator("Snow Generatror F43 ", "SMI",
                12.5, 452.5, Fuel.GAZOLINE, WheelFormula.FOUR_FOUR, 64.5,
                "nuctpr", 60.0 );
        SkiResortMachinery snowTowerI54 = new SnowTower("Carriage Lift Tower", "SMI",
                5.5, 552.5, Fuel.KEROSENE, WheelFormula.TWO_TWO, 734,true,
                4);
        SkiResortMachinery machinery3 = new SwivelMast("Swivel Mast Swing Arm ", "SMI",
                3.5, 762.5, Fuel.DIESEL, WheelFormula.FOUR_TWO,46.4, 67.2,
                359.0 );

        manager.toAdd(snowGeneratorF43);
        manager.toAdd(snowTowerI54);
        manager.toAdd(machinery3);

        System.out.print(manager.sortByMileageOfMachinery(true));
        manager.sortByFuelLossPerHour(false);
        manager.findByWheelFormula(WheelFormula.FOUR_FOUR);
        manager.findByFuel(Fuel.DIESEL);
    }
}
