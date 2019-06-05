package ua.lviv.iot.Db_Lab8.managers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ua.lviv.iot.Db_Lab8.models.Fuel;
import ua.lviv.iot.Db_Lab8.models.WheelFormula;

@Entity()
@Table(name = "skiresortmachinery")
class SkiResortMachinery {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "name")
    private String name;
    @Column(name = "producer")
    private String producer;
    @Column(name = "fuelPerHour")
    private double fuelPerHour;
    @Column(name = "mileage")
    private double mileage;
    @Column(name = "typeOfFuel")
    private Fuel typeOfFuel;
    @Column(name = "wheelFormula")
    private WheelFormula wheelFormula;

    public SkiResortMachinery() {

    }

    public SkiResortMachinery(String name, String producer, double fuelPerHour, double mileage, Fuel typeOfFuel,
            WheelFormula wheelFormula) {
        super();
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
        return "SkiResortMachinery [name=" + name + ", producer=" + producer + ", fuelPerHour=" + fuelPerHour
                + ", mileage=" + mileage + ", typeOfFuel=" + typeOfFuel + ", wheelFormula=" + wheelFormula + "]";
    }

}
