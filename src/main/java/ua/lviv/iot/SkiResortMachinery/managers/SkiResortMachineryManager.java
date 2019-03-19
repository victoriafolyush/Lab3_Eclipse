package main.java.ua.lviv.iot.SkiResortMachinery.managers;

import main.java.ua.lviv.iot.SkiResortMachinery.models.Fuel;
import main.java.ua.lviv.iot.SkiResortMachinery.models.SkiResortMachinery;
import main.java.ua.lviv.iot.SkiResortMachinery.models.WheelFormula;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SkiResortMachineryManager {
    private List<SkiResortMachinery> machineryList = new ArrayList<>();

    public SkiResortMachineryManager() {
    }

    public SkiResortMachineryManager(final List<SkiResortMachinery> list) {
        this.machineryList = list;
    }

    final void toAdd(final SkiResortMachinery machinery) {
        machineryList.add(machinery);
    }

    final List<SkiResortMachinery> sortByFuelLossPerHour(
            final boolean decreasing) {

        Comparator<SkiResortMachinery> comparator = Comparator.comparingDouble(
                SkiResortMachinery::getFuelPerHour);
        machineryList.sort(comparator);
        if (decreasing) {
            Collections.reverse(machineryList);
        }
        return machineryList;
    }

    final List<SkiResortMachinery> sortByMileageOfMachinery(
            final boolean decreasing) {
        Comparator<SkiResortMachinery> comparator = Comparator.comparingDouble(
                SkiResortMachinery::getMileage);
        machineryList.sort(comparator);
        if (decreasing) {
            Collections.reverse(machineryList);
        }
        return machineryList;
    }

    final List<SkiResortMachinery> findByFuel(final Fuel typeOfFuelTemp) {
        return machineryList.stream().filter(machinery ->
        machinery.getTypeOfFuel().equals(typeOfFuelTemp))
                .collect(Collectors.toList());
    }

    final List<SkiResortMachinery> findByWheelFormula(
            final WheelFormula wheelFormulaTemp) {
        return machineryList.stream().filter(machinery ->
        machinery.getWheelFormula().equals(wheelFormulaTemp))
                .collect(Collectors.toList());
    }

}
