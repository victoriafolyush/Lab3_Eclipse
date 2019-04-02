package ua.lviv.iot.SkiResortMachinery.managers;

import java.util.List;

import ua.lviv.iot.SkiResortMachinery.models.Fuel;
import ua.lviv.iot.SkiResortMachinery.models.SkiResortMachinery;
import ua.lviv.iot.SkiResortMachinery.models.SnowGenerator;
import ua.lviv.iot.SkiResortMachinery.models.SnowTower;
import ua.lviv.iot.SkiResortMachinery.models.SwivelMast;
import ua.lviv.iot.SkiResortMachinery.models.WheelFormula;

final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        SkiResortMachineryManager manager = new SkiResortMachineryManager();
        List<SkiResortMachinery> tempList;
        tempList = manager.getMachineryList();

        SkiResortMachinery snowGeneratorF43 = new SnowGenerator("Snow Generatror F43 ", "SMI", 12.5, 452.5,
                Fuel.GAZOLINE, WheelFormula.FOUR_FOUR, 64.5, "nucleation", 60.0);
        SkiResortMachinery snowTowerI54 = new SnowTower("Carriage Lift Tower", "SMI", 5.5, 552.5, Fuel.KEROSENE,
                WheelFormula.TWO_TWO, 734, true, 4);
        SkiResortMachinery swivelMastSwingArm = new SwivelMast("Swivel Mast Swing Arm ", "SMI", 3.5, 762.5, Fuel.DIESEL,
                WheelFormula.FOUR_TWO, 46.4, 67.2, 359.0);

        manager.addMachinery(snowGeneratorF43);
        manager.addMachinery(snowTowerI54);
        manager.addMachinery(swivelMastSwingArm);

        System.out.print(manager.sortByMileage(manager.getMachineryList(), false));
        System.out.println(manager.sortByFuelLossPerHour(manager.getMachineryList(), false));
        System.out.println(manager.findByFuel(Fuel.DIESEL, tempList));
        System.out.println(manager.findByFuel(Fuel.DIESEL, tempList));
    }
}
