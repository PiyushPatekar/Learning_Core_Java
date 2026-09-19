abstract class Vehicle{
    int noOfTyres;

    void displayTyres() {
        System.out.println("No of tyres: " + noOfTyres);
    }

    abstract void start();
}

class Car extends Vehicle{
     void start() {
        noOfTyres = 4;
        System.out.println("Car is start with key");
    }
}

class Bike extends Vehicle{
   void start() {
        noOfTyres = 2;
        System.out.println("Bike is start with Kick");
    }
}

public class Abstractkeyword{
    
    public static void main(String[] args) {
        
        Vehicle vehicle = new Bike();
        vehicle.start();
        vehicle.displayTyres();
        

        Vehicle vehicle2 = new Car();
        vehicle2.start();
        vehicle2.displayTyres();
    }
}