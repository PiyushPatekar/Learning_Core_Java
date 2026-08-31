class Dog {
    String name = "Rocky";

    void bark() {
        System.out.println(name + " Barks !");
    }
}

public class Main{
    public static void main(String[] args) {
        // Main obj = new Main();

        Dog obj = new Dog();
        obj.name = "Rocky";
        obj.bark();
        
    }
}