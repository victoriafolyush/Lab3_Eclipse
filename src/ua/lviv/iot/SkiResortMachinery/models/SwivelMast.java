package ua.lviv.iot.SkiResortMachinery.models;

public class SwivelMast extends SkiResortMachinery {
    private double lengthOfFlow;
    private double heightOfFlow;
    private double oscillator;

    SwivelMast() {

    }

    public SwivelMast(double lengthOfFlow, double heightOfFlow, double oscillator) {
        this.lengthOfFlow = lengthOfFlow;
        this.heightOfFlow = heightOfFlow;
        this.oscillator = oscillator;
    }

    public SwivelMast(String name, String producer, double fuelPerHour, double mileage, Fuel typeOfFuel, WheelFormula wheelFormula, double lengthOfFlow, double heightOfFlow, double oscillator) {
        super(name, producer, fuelPerHour, mileage, typeOfFuel, wheelFormula);
        this.lengthOfFlow = lengthOfFlow;
        this.heightOfFlow = heightOfFlow;
        this.oscillator = oscillator;
    }

    public double getLengthOfFlow() {
        return lengthOfFlow;
    }

    public void setLengthOfFlow(double lengthOfFlow) {
        this.lengthOfFlow = lengthOfFlow;
    }

    public double getHeightOfFlow() {
        return heightOfFlow;
    }

    public void setHeightOfFlow(double heightOfFlow) {
        this.heightOfFlow = heightOfFlow;
    }

    public double getOscillator() {
        return oscillator;
    }

    public void setOscillator(double oscillator) {
        this.oscillator = oscillator;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Length of flow = " + lengthOfFlow + "\n" +
                ", Hight of flow = " + heightOfFlow + "\n" +
                ", Oscillator = " + oscillator + "\n" +
                '\n';
    }
}
