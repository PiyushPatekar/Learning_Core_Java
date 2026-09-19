interface Vehicle{

    void start();

    void stop();
}

class Car implements Vehicle {
    
    @Override
    public void start() {
        System.out.println("Car is Starting....");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopped");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is Starting....");
    }

    @Override
    public void stop() {
        System.out.println("Bike is Stopped");
    }
}


public class Interfaceexample {

    public static void main(String[] args) {
        
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();

        Vehicle vehicle1 = new Bike();
        vehicle1.start();
        vehicle1.stop();

    }
}