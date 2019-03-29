package ua.lviv.iot.SkiResortMachinery.models;

public class SkiResortMachinery {

    private String name;
    private String producer;
    private double fuelPerHour;
    private double mileage;
    private Fuel typeOfFuel;
    private WheelFormula wheelFormula;

    public SkiResortMachinery() {

    }

    public SkiResortMachinery(final String nameTemp,
            final String producerTemp, final double fuelPerHourTemp,
            final double mileageTemp, final Fuel typeOfFuelTemp,
            final WheelFormula wheelFormulaTemp) {
        this.name = nameTemp;
        this.producer = producerTemp;
        this.fuelPerHour = fuelPerHourTemp;
        this.mileage = mileageTemp;
        this.typeOfFuel = typeOfFuelTemp;
        this.wheelFormula = wheelFormulaTemp;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String nameTemp) {
        this.name = nameTemp;
    }

    public final String getProducer() {
        return producer;
    }

    public final void setProducer(final String producerTemp) {
        this.producer = producerTemp;
    }

    public final double getFuelPerHour() {
        return fuelPerHour;
    }

    public final void setFuelPerHour(final double fuelPerHourTemp) {
        this.fuelPerHour = fuelPerHourTemp;
    }

    public final double getMileage() {
        return mileage;
    }

    public final void setMileage(final double mileageTemp) {
        this.mileage = mileageTemp;
    }

    public final Fuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public final void setTypeOfFuel(final Fuel typeOfFuelTemp) {
        this.typeOfFuel = typeOfFuelTemp;
    }

    public final WheelFormula getWheelFormula() {
        return wheelFormula;
    }

    public final void setWheelFormula(final WheelFormula wheelFormulaTemp) {
        this.wheelFormula = wheelFormulaTemp;
    }

    @Override
    public String toString() {
        return "Name = '" + name
                + '\n' + ", Producer = '" + producer
                + '\n' + ", Fuel per hour = " + fuelPerHour
                + '\n' + ", Mileage = " + mileage
                + '\n' + ", Type of fuel = " + typeOfFuel
                + '\n' + ", Wheel formula = " + wheelFormula
                + '\n';
    }
}
