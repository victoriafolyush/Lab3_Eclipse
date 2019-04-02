package ua.lviv.iot.SkiResortMachinery.managers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.SkiResortMachinery.models.Fuel;
import ua.lviv.iot.SkiResortMachinery.models.SkiResortMachinery;
import ua.lviv.iot.SkiResortMachinery.models.SnowGenerator;
import ua.lviv.iot.SkiResortMachinery.models.SnowTower;
import ua.lviv.iot.SkiResortMachinery.models.SwivelMast;
import ua.lviv.iot.SkiResortMachinery.models.WheelFormula;

class SkiResortMachineryWriterTest {
    private File file = new File("output2.csv");;
    private SkiResortMachineryWriter writer = new SkiResortMachineryWriter();
    private List<SkiResortMachinery> listTest = new ArrayList<SkiResortMachinery>();
    private SkiResortMachineryManager managerTest = new SkiResortMachineryManager();

    @BeforeEach
    public void setUp() {
        listTest = new ArrayList<>();

        SnowGenerator obj1 = new SnowGenerator("Snow Generator F43 ", "SMI", 12.5, 452.5, Fuel.GAZOLINE,
                WheelFormula.FOUR_FOUR, 64.5, "nucleation", 60.0);

        SnowTower obj2 = new SnowTower("Carriage Lift Tower", "SMI", 5.5, 552.5, Fuel.KEROSENE, WheelFormula.TWO_TWO,
                734, true, 4);

        SwivelMast obj3 = new SwivelMast("Swivel Mast Swing Arm ", "SMI", 3.5, 762.5, Fuel.DIESEL,
                WheelFormula.FOUR_TWO, 46.4, 67.2, 359.0);

        listTest.add(obj1);
        listTest.add(obj2);
        listTest.add(obj3);

        managerTest.setMachineryList(listTest);
    }

    @Test
    void testWriteToFile() throws IOException {
        System.out.println(listTest);
        writer.writeToFile(listTest, file);
        Assertions.assertNotEquals(file.length(), 0);
    }
}
