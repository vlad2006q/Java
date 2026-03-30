class Device {
    String brand;
    int power;

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void turnOn() {
        System.out.println(brand + " device is turning on.");
    }
}

class Laptop extends Device {

    Laptop(String brand, int power) {
        super(brand, power);
    }
}

class Smartphone extends Device {

    Smartphone(String brand, int power) {
        super(brand, power);
    }
}

class Tablet extends Device {

    Tablet(String brand, int power) {
        super(brand, power);
    }
}

public class variant6 {
    public static void main(String[] args) {

        Laptop l = new Laptop("Dell Laptop", 65);
        Smartphone s = new Smartphone("Samsung Smartphone", 20);
        Tablet t = new Tablet("Apple Tablet", 30);

        l.turnOn();
        s.turnOn();
        t.turnOn();
    }
}
