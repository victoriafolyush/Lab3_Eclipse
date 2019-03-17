package ua.lviv.iot.SkiResortMachinery.models;

public class SnowGenerator extends SkiResortMachinery {
    private double boardCompressorPower;
    private String nucleation;
    private double rotation;

    SnowGenerator (){

    }

    public SnowGenerator(double boardCompressorPower, String nucleation, double rotation) {
        this.boardCompressorPower = boardCompressorPower;
        this.nucleation = nucleation;
        this.rotation = rotation;
    }

    public SnowGenerator(String name, String producer, double fuelPerHour, double mileage, Fuel typeOfFuel, WheelFormula wheelFormula, double boardCompressorPower, String nucleation, double rotation) {
        super(name, producer, fuelPerHour, mileage, typeOfFuel, wheelFormula);
        this.boardCompressorPower = boardCompressorPower;
        this.nucleation = nucleation;
        this.rotation = rotation;
    }

    public double getBoardCompressorPower() {
        return boardCompressorPower;
    }

    public void setBoardCompressorPower(double boardCompressorPower) {
        this.boardCompressorPower = boardCompressorPower;
    }

    public String getNucleation() {
        return nucleation;
    }

    public void setNucleation(String nucleation) {
        this.nucleation = nucleation;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Board compressor power = " + boardCompressorPower  + "\n" +
                ", Nucleation = '" + nucleation + '\''  + "\n" +
                ", Rotation = " + rotation + "\n" +
                '\n';
    }
}
