package main.java.ua.lviv.iot.SkiResortMachinery.models;


public class SkiResortMachinery {

    private String name;
    private String producer;
    private double fuelPerHour;
    private double mileage;
    private Fuel typeOfFuel;
    private WheelFormula wheelFormula;

    public SkiResortMachinery() {

    }

    public SkiResortMachinery(String name, String producer, double fuelPerHour, double mileage, Fuel typeOfFuel, WheelFormula wheelFormula) {
        this.name = name;
        this.producer = producer;
        this.fuelPerHour = fuelPerHour;
        this.mileage = mileage;
        this.typeOfFuel = typeOfFuel;
        this.wheelFormula = wheelFormula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getFuelPerHour() {
        return fuelPerHour;
    }

    public void setFuelPerHour(double fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Fuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(Fuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public WheelFormula getWheelFormula() {
        return wheelFormula;
    }

    public void setWheelFormula(WheelFormula wheelFormula) {
        this.wheelFormula = wheelFormula;
    }

    @Override
    public String toString() {
        return
                "Name = '" + name + '\n' +
                        ", Producer = '" + producer + '\n' +
                        ", Fuel per hour = " + fuelPerHour + '\n' +
                        ", Mileage = " + mileage + '\n' +
                        ", Type of fuel = " + typeOfFuel + '\n' +
                        ", Wheel formula = " + wheelFormula + '\n';
    }
}
