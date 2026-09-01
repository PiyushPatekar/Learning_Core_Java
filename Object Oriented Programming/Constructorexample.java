class Employee {
    String name;
    double salary;

    //Parameterized Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Parameterized Constructor Executed");
    }

    void displayInfo() {
        System.err.println("Employee Name is " + name + " with salary " + salary);
    }
}

public class Constructorexample {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Piyush", 100000);
        emp1.displayInfo();

    }
}
