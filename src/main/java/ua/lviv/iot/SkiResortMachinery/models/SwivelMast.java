package main.java.ua.lviv.iot.SkiResortMachinery.models;

public class SwivelMast extends SkiResortMachinery {
    private double lengthOfFlow;
    private double heightOfFlow;
    private double oscillator;

    SwivelMast() {

    }

    public SwivelMast(final double lengthOfFlowTemp,
            final double heightOfFlowTemp, final double oscillatorTemp) {
        this.lengthOfFlow = lengthOfFlowTemp;
        this.heightOfFlow = heightOfFlowTemp;
        this.oscillator = oscillatorTemp;
    }

    public SwivelMast(final String nameTemp, final String producerTemp,
            final double fuelPerHourTemp, final double mileageTemp,
            final Fuel typeOfFuelTemp, final WheelFormula wheelFormulaTemp,
            final double lengthOfFlowTemp, final double heightOfFlowTemp,
            final double oscillatorTemp) {
        super(nameTemp, producerTemp, fuelPerHourTemp, mileageTemp,
                typeOfFuelTemp, wheelFormulaTemp);
        this.lengthOfFlow = lengthOfFlowTemp;
        this.heightOfFlow = heightOfFlowTemp;
        this.oscillator = oscillatorTemp;
    }

    public final double getLengthOfFlow() {
        return lengthOfFlow;
    }

    public final void setLengthOfFlow(final double lengthOfFlowTemp) {
        this.lengthOfFlow = lengthOfFlowTemp;
    }

    public final double getHeightOfFlow() {
        return heightOfFlow;
    }

    public final void setHeightOfFlow(final double heightOfFlowTemp) {
        this.heightOfFlow = heightOfFlowTemp;
    }

    public final double getOscillator() {
        return oscillator;
    }

    public final void setOscillator(final double oscillatorTemp) {
        this.oscillator = oscillatorTemp;
    }

    @Override
    public String toString() {
        return super.toString() + " Length of flow = " + lengthOfFlow
                + "\n" + ", Hight of flow = " + heightOfFlow
                + "\n" + ", Oscillator = " + oscillator
                + "\n" + '\n';
    }
}
