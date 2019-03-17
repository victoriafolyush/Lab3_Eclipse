package main.java.ua.lviv.iot.SkiResortMachinery.managers;

import main.java.ua.lviv.iot.SkiResortMachinery.models.Fuel;
import main.java.ua.lviv.iot.SkiResortMachinery.models.SkiResortMachinery;
import main.java.ua.lviv.iot.SkiResortMachinery.models.WheelFormula;

import java.util.*;
import java.util.stream.Collectors;


public class SkiResortMachineryManager {
    private List<SkiResortMachinery> machineryList = new ArrayList<>();

    public SkiResortMachineryManager() {
    }

    public SkiResortMachineryManager(List<SkiResortMachinery> list) {
        this.machineryList = list;
    }

    public void toAdd(SkiResortMachinery machinery) {
        machineryList.add(machinery);
    }

    public List<SkiResortMachinery> sortByFuelLossPerHour(boolean decreasing) {

        Comparator<SkiResortMachinery> comparator = Comparator.comparingDouble(SkiResortMachinery::getFuelPerHour);
        machineryList.sort(comparator);
        if (decreasing) {
            Collections.reverse(machineryList);
        }
        return machineryList;
    }

    public List<SkiResortMachinery> sortByMileageOfMachinery(boolean decreasing) {
        Comparator<SkiResortMachinery> comparator = Comparator.comparingDouble(SkiResortMachinery::getMileage);
        machineryList.sort(comparator);
        if (decreasing) {
            Collections.reverse(machineryList);
        }
        return machineryList;
    }

    public List<SkiResortMachinery> findByFuel(Fuel typeOfFuelTemp) {
        return machineryList.stream().filter(machinery ->
                machinery.getTypeOfFuel().equals(typeOfFuelTemp)).collect(Collectors.toList());
    }

    public List<SkiResortMachinery> findByWheelFormula(WheelFormula wheelFormulaTemp) {
        return machineryList.stream().filter(machinery ->
                machinery.getWheelFormula().equals(wheelFormulaTemp)).collect(Collectors.toList());
    }

}
