package ua.lviv.iot.SkiResortMachinery.models;

public class SwivelMast extends SkiResortMachinery {
    private double lengthOfFlow;
    private double heightOfFlow;
    private double oscillator;

    public SwivelMast() {

    }

    public SwivelMast(final String nameTemp, final String producerTemp, final double fuelPerHourTemp,
            final double mileageTemp, final Fuel typeOfFuelTemp, final WheelFormula wheelFormulaTemp,
            final double lengthOfFlowTemp, final double heightOfFlowTemp, final double oscillatorTemp) {
        super(nameTemp, producerTemp, fuelPerHourTemp, mileageTemp, typeOfFuelTemp, wheelFormulaTemp);
        this.lengthOfFlow = lengthOfFlowTemp;
        this.heightOfFlow = heightOfFlowTemp;
        this.oscillator = oscillatorTemp;
    }

    public String getHeaders() {
        return super.getHeaders() + ", Length of flow" + ", Height of flow" + ", Oscillator";
    }

    public String toCSV() {
        return super.toCSV() + ", " + this.getLengthOfFlow() + ", " + this.getHeightOfFlow() + ", "
                + this.getOscillator();
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
        return super.toString() + " Length of flow = " + lengthOfFlow + "\n" + ", Hight of flow = " + heightOfFlow
                + "\n" + ", Oscillator = " + oscillator + "\n" + '\n';
    }
}
