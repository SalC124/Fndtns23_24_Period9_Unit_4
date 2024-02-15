public class Vehicle {
    // Instance Variables
    private String make;
    private String model;
    private double fuelCapacity;
    private double fuelLevel;
    private double mpg;
    private double totalMiles;

    // Constructors
    public Vehicle(String make, String model, double fuelCapacity, double fuelLevel, double mpg) {
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.mpg = mpg;
        totalMiles = 0;
    }

    public Vehicle(String make, String model, double fuelCapacity, double mpg) {
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
        totalMiles = 0;
        fuelLevel = fuelCapacity;
    }

    // Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
    public double getMpg() {
        return mpg;
    }
    public double getTotalMiles() {
        return totalMiles;
    }

    // Create setters for make, model, and mpg
    public void setMake(String newMake) {
        make = newMake;
    }

    public  void setModel(String model) {
        this.model = model;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    // Create a method addGas(double)
    public void addGas(double addedGas) {
        fuelLevel += addedGas;
        if(fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity;
        }
    }

    // Create a method getRange which will return the number of miles the car can drive based upon mpg and fuelLevel
    public double getRange() {
        return fuelLevel * mpg;
    }

    // Create a method drive(double miles). Increase totalMiles; decrease fuelLevel.
    public void drive(double miles) {
        fuelLevel = fuelLevel - (miles / mpg);
        totalMiles += miles;
    }
    // Override toString
    public String toString() {
        return make + " " + model + " | " + mpg + "mi/gal" + " | Fuel Level: " + fuelLevel + "gal/" + fuelCapacity + "gal in tank | Range = " + getRange() + "mi | Total Miles = " + totalMiles + "mi";
    }
}
