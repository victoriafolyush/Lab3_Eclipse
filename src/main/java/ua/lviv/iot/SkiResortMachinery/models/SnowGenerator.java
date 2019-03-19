package main.java.ua.lviv.iot.SkiResortMachinery.models;

public class SnowGenerator extends SkiResortMachinery {
    private double boardCompressorPower;
    private String nucleation;
    private double rotation;

    SnowGenerator() {

    }

    public SnowGenerator(final double boardCompressorPowerTemp,
            final String nucleationTemp, final double rotationTemp) {
        this.boardCompressorPower = boardCompressorPowerTemp;
        this.nucleation = nucleationTemp;
        this.rotation = rotationTemp;
    }

    public SnowGenerator(final String name, final String producer,
            final double fuelPerHour, final double mileage,
            final Fuel typeOfFuel, final WheelFormula wheelFormulaTemp,
            final double boardCompressorPowerTemp,
            final String nucleationTemp, final double rotationTemp) {
        super(name, producer, fuelPerHour,
                mileage, typeOfFuel, wheelFormulaTemp);
        this.boardCompressorPower = boardCompressorPowerTemp;
        this.nucleation = nucleationTemp;
        this.rotation = rotationTemp;
    }

    public final double getBoardCompressorPower() {
        return boardCompressorPower;
    }

    public final void setBoardCompressorPower(
            final double boardCompressorPowerTemp) {
        this.boardCompressorPower = boardCompressorPowerTemp;
    }

    public final String getNucleation() {
        return nucleation;
    }

    public final void setNucleation(final String nucleationTemp) {
        this.nucleation = nucleationTemp;
    }

    public final double getRotation() {
        return rotation;
    }

    public final void setRotation(final double rotationTemp) {
        this.rotation = rotationTemp;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Board compressor power = " + boardCompressorPower
                + "\n" + ", Nucleation = '" + nucleation
                + "\n" + ", Rotation = " + rotation
                + "\n" + '\n';
    }
}
