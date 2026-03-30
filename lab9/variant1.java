class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " moves with speed " + speed);
    }
}

class Car extends Transport {
    Car(String name, int speed) {
        super(name, speed);
    }

    void move() {
        System.out.println(name + " drives on the road at " + speed + " km/h");
    }
}

class Train extends Transport {
    Train(String name, int speed) {
        super(name, speed);
    }

    void move() {
        System.out.println(name + " moves on rails at " + speed + " km/h");
    }
}

class Airplane extends Transport {
    Airplane(String name, int speed) {
        super(name, speed);
    }

    void move() {
        System.out.println(name + " flies in the sky at " + speed + " km/h");
    }
}
class Ship extends Transport {
    Ship(String name, int speed) {
        super(name, speed);
    }
    void move() {
        System.out.println(name + " sails on water " + speed + " km/h");
    }
}
public class variant1 {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 180);
        Train train = new Train("Express", 250);
        Airplane plane = new Airplane("Boeing", 900);
        Ship ship = new Ship("Neptune", 40);

        car.move();
        train.move();
        plane.move();
        ship.move();
    }
}