package Practice;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle created");
    }

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    Bike() {
        System.out.println("Bike created");
    }

    @Override
    void run() {
        System.out.println("Bike is running at 60km/h");
    }
}

public class PolymorphismOverrideDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike(); // Upcasting
        v.run();
    }
}
