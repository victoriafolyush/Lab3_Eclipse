package ua.lviv.iot.SkiResortMachinery.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.SkiResortMachinery.models.Fuel;
import ua.lviv.iot.SkiResortMachinery.models.SkiResortMachinery;
import ua.lviv.iot.SkiResortMachinery.models.WheelFormula;

public class SkiResortMachineryManager {
    private List<SkiResortMachinery> machineryList = new LinkedList<SkiResortMachinery>();

    public SkiResortMachineryManager() {
    }

    public SkiResortMachineryManager(final List<SkiResortMachinery> listTemp) {
        this.machineryList = listTemp;
    }

    final void addMachinery(final SkiResortMachinery machineryTemp) {
        machineryList.add(machineryTemp);
    }

    private List<SkiResortMachinery> generalSort(final List<SkiResortMachinery> tempList, final boolean ascending,
            final Comparator<SkiResortMachinery> comparator) {
        if (ascending) {
            Collections.sort(tempList, comparator.reversed());
        } else {
            Collections.sort(tempList, comparator);
        }
        return tempList;
    }

    public final List<SkiResortMachinery> sortByFuelLossPerHour(final List<SkiResortMachinery> tempList,
            final boolean decreasing) {
        return generalSort(tempList, decreasing, Comparator.comparing(SkiResortMachinery::getFuelPerHour));
    }

    public final List<SkiResortMachinery> sortByMileage(final List<SkiResortMachinery> tempList,
            final boolean decreasing) {
        return generalSort(tempList, decreasing, Comparator.comparing(SkiResortMachinery::getMileage));
    }

    public final List<SkiResortMachinery> findByFuel(final Fuel typeOfFuelTemp,
            final List<SkiResortMachinery> tempList) {
        return tempList.stream().filter(machinery -> machinery.getTypeOfFuel().equals(typeOfFuelTemp))
                .collect(Collectors.toList());
    }

    public final List<SkiResortMachinery> findByWheelFormula(final WheelFormula wheelFormulaTemp,
            final List<SkiResortMachinery> tempList) {
        return tempList.stream().filter(machinery -> machinery.getWheelFormula().equals(wheelFormulaTemp))
                .collect(Collectors.toList());
    }

    public final List<SkiResortMachinery> getMachineryList() {
        return machineryList;
    }

    public final void setMachineryList(final List<SkiResortMachinery> machineryListTemp) {
        this.machineryList = machineryListTemp;
    }

}
