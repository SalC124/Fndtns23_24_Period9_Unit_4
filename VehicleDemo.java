public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle corolla = new Vehicle("Toyota", "Corolla", 12.5, 42);
        Vehicle mustang = new Vehicle("Ford", "Mustang", 16, 24, 9);
        System.out.println("Range for Corolla: " + corolla.getRange());
        System.out.println("Range for Mustang: " + mustang.getRange());
        mustang.drive(100);
        mustang.addGas(5);
        System.out.println(mustang);
    }
}