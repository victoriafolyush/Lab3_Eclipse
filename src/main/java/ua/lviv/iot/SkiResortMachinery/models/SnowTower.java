package main.java.ua.lviv.iot.SkiResortMachinery.models;

public class SnowTower extends SkiResortMachinery {
    private double height;
    private boolean hasBoardCopressor;
    private int waterJets;

    SnowTower() {
    }

    public SnowTower(double height, boolean hasBoardCopressor, int waterJets) {
        this.height = height;
        this.hasBoardCopressor = hasBoardCopressor;
        this.waterJets = waterJets;
    }

    public SnowTower(String name, String producer, double fuelPerHour, double mileage, Fuel typeOfFuel, WheelFormula wheelFormula, double height, boolean hasBoardCopressor, int waterJets) {
        super(name, producer, fuelPerHour, mileage, typeOfFuel, wheelFormula);
        this.height = height;
        this.hasBoardCopressor = hasBoardCopressor;
        this.waterJets = waterJets;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasBoardCopressor() {
        return hasBoardCopressor;
    }

    public void setHasBoardCopressor(boolean hasBoardCopressor) {
        this.hasBoardCopressor = hasBoardCopressor;
    }

    public int getWaterJets() {
        return waterJets;
    }

    public void setWaterJets(int waterJets) {
        this.waterJets = waterJets;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Height = " + height  + "\n" +
                ", Has board copressor = " + hasBoardCopressor  + "\n" +
                ", Water jets = " + waterJets  + "\n" +
                "\n";
    }
}
