package ua.lviv.iot.SkiResortMachinery.managers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.SkiResortMachinery.models.Fuel;
import ua.lviv.iot.SkiResortMachinery.models.SkiResortMachinery;
import ua.lviv.iot.SkiResortMachinery.models.SnowGenerator;
import ua.lviv.iot.SkiResortMachinery.models.WheelFormula;
import ua.lviv.iot.SkiResortMachinery.models.SnowTower;
import ua.lviv.iot.SkiResortMachinery.models.SwivelMast;
import ua.lviv.iot.SkiResortMachinery.managers.SkiResortMachineryManager;

class SkiResortMachineryManagerTest {

    private List<SkiResortMachinery> listTest;
    private List<SkiResortMachinery> actual;
    private List<SkiResortMachinery> expected;

    private SkiResortMachineryManager manager;
    private SnowGenerator snowGenerator1;
    private SnowGenerator snowGenerator2;
    private SnowTower snowTower1;
    private SnowTower snowTower2;
    private SwivelMast swivelMast1;
    private SwivelMast swivelMast2;

    @BeforeEach
    public void setUp() {
        manager = new SkiResortMachineryManager();

        snowGenerator1 = new SnowGenerator();
        snowGenerator1.setName("Snow Generator name1");
        snowGenerator1.setProducer("Snow Generator producer1");
        snowGenerator1.setNucleation("Snow Generator nucleation1");
        snowGenerator1.setBoardCompressorPower(23.5);
        snowGenerator1.setFuelPerHour(2.1);
        snowGenerator1.setMileage(456.0);
        snowGenerator1.setRotation(360.0);
        snowGenerator1.setTypeOfFuel(Fuel.DIESEL);
        snowGenerator1.setWheelFormula(WheelFormula.FOUR_FOUR);

        snowGenerator2 = new SnowGenerator();
        snowGenerator2.setName("Snow Genarator name2");
        snowGenerator2.setProducer("Snow Generator producer2");
        snowGenerator2.setNucleation("Snow Generator nucleation");
        snowGenerator2.setBoardCompressorPower(2.3);
        snowGenerator2.setFuelPerHour(12.5);
        snowGenerator2.setMileage(646.6);
        snowGenerator2.setRotation(180.0);
        snowGenerator2.setTypeOfFuel(Fuel.GAZOLINE);
        snowGenerator2.setWheelFormula(WheelFormula.FOUR_TWO);

        snowTower1 = new SnowTower();
        snowTower1.setName("Snow Tower name1");
        snowTower1.setProducer("Snow Tower producer1");
        snowTower1.setFuelPerHour(4.5);
        snowTower1.setHeight(56.7);
        snowTower1.setMileage(427.7);
        snowTower1.setWaterJets(4);
        snowTower1.setHasBoardCopressor(true);
        snowTower1.setTypeOfFuel(Fuel.GAZOLINE);
        snowTower1.setWheelFormula(WheelFormula.FOUR_TWO);

        snowTower2 = new SnowTower();
        snowTower2.setName("Snow Tower name2");
        snowTower2.setProducer("Snow Tower producer2");
        snowTower2.setFuelPerHour(6.5);
        snowTower2.setHeight(66.7);
        snowTower2.setMileage(327.7);
        snowTower2.setWaterJets(3);
        snowTower2.setHasBoardCopressor(false);
        snowTower2.setTypeOfFuel(Fuel.KEROSENE);
        snowTower2.setWheelFormula(WheelFormula.FOUR_FOUR);

        swivelMast1 = new SwivelMast();
        swivelMast1.setName("Swivel Mast name1");
        swivelMast1.setProducer("Swivel Mast producer1");
        swivelMast1.setFuelPerHour(5.7);
        swivelMast1.setHeightOfFlow(99.8);
        swivelMast1.setLengthOfFlow(445.0);
        swivelMast1.setMileage(785.9);
        swivelMast1.setOscillator(34.5);
        swivelMast1.setTypeOfFuel(Fuel.KEROSENE);
        swivelMast1.setWheelFormula(WheelFormula.TWO_TWO);

        swivelMast2 = new SwivelMast();
        swivelMast2.setName("Swivel Mast name2");
        swivelMast2.setProducer("Swivel Mast producer2");
        swivelMast2.setFuelPerHour(5.8);
        swivelMast2.setHeightOfFlow(99.9);
        swivelMast2.setLengthOfFlow(445.3);
        swivelMast2.setMileage(785.2);
        swivelMast2.setOscillator(34.4);
        swivelMast2.setTypeOfFuel(Fuel.DIESEL);
        swivelMast2.setWheelFormula(WheelFormula.TWO_TWO);

        listTest = Arrays.asList(snowGenerator1, snowTower1, swivelMast1, snowGenerator2, snowTower2, swivelMast2);
        // System.out.println(manager.getMachineryList());

    }

    @Test
    void testSortByFuelLossPerHourIncreasing() {
        expected = Arrays.asList(snowGenerator1, snowTower1, swivelMast1, swivelMast2, snowTower2, snowGenerator2);
        actual = manager.sortByFuelLossPerHour(listTest, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSortByFuelLossPerHourDecreasing() {
        expected = Arrays.asList(snowGenerator2, snowTower2, swivelMast2, swivelMast1, snowTower1, snowGenerator1);
        actual = manager.sortByFuelLossPerHour(listTest, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSortByMileageIncreasing() {
        expected = Arrays.asList(snowTower2, snowTower1, snowGenerator1, snowGenerator2, swivelMast2, swivelMast1);
        actual = manager.sortByMileage(listTest, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSortByMileageDecreasing() {
        expected = Arrays.asList(swivelMast1, swivelMast2, snowGenerator2, snowGenerator1, snowTower1, snowTower2);
        actual = manager.sortByMileage(listTest, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindByFuel() {
        expected = new LinkedList<>();
        expected.add(snowGenerator1);
        expected.add(swivelMast2);
        actual = manager.findByFuel(Fuel.DIESEL, listTest);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindByWheelFormula() {
        expected = new LinkedList<>();
        expected.add(swivelMast1);
        expected.add(swivelMast2);
        actual = manager.findByWheelFormula(WheelFormula.TWO_TWO, listTest);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testAddMachinery() {
        manager.addMachinery(snowGenerator1);
        manager.addMachinery(snowTower1);
        manager.addMachinery(swivelMast1);
        expected = manager.getMachineryList();
        Assertions.assertEquals(6, listTest.size());
    }

    @Test
    void testPrintList() {
        manager.setMachineryList(listTest);
        expected = manager.getMachineryList();
        System.out.print(expected);

    }

}
