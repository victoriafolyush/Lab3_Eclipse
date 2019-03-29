package ua.lviv.iot.SkiResortMachinery.models;

public class SnowTower extends SkiResortMachinery {
    private double height;
    private boolean hasBoardCopressor;
    private int waterJets;

    public SnowTower() {
    }

    public SnowTower(final double heightTemp, final boolean hasBoardCopressorTemp, final int waterJetsTemp) {
        this.height = heightTemp;
        this.hasBoardCopressor = hasBoardCopressorTemp;
        this.waterJets = waterJetsTemp;
    }

    public SnowTower(final String nameTemp, final String producerTemp, final double fuelPerHourTemp,
            final double mileageTemp, final Fuel typeOfFuelTemp, final WheelFormula wheelFormulaTemp,
            final double heightTemp, final boolean hasBoardCopressorTemp, final int waterJetsTemp) {
        super(nameTemp, producerTemp, fuelPerHourTemp, mileageTemp, typeOfFuelTemp, wheelFormulaTemp);
        this.height = heightTemp;
        this.hasBoardCopressor = hasBoardCopressorTemp;
        this.waterJets = waterJetsTemp;
    }

    public final double getHeight() {
        return height;
    }

    public final void setHeight(final double heightTemp) {
        this.height = heightTemp;
    }

    public final boolean isHasBoardCopressor() {
        return hasBoardCopressor;
    }

    public final void setHasBoardCopressor(final boolean hasBoardCopressorTemp) {
        this.hasBoardCopressor = hasBoardCopressorTemp;
    }

    public final int getWaterJets() {
        return waterJets;
    }

    public final void setWaterJets(final int waterJetsTemp) {
        this.waterJets = waterJetsTemp;
    }

    @Override
    public String toString() {
        return super.toString() + " Height = " + height + "\n" + ", Has board copressor = " + hasBoardCopressor + "\n"
                + ", Water jets = " + waterJets + "\n" + "\n";
    }
}
