class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Parameterized Constructor Executed");
    }

    //Copy Constructor
    Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println("Copy Constructor Executed");
    }

    void displayInfo() {
        System.err.println("Employee Name is " + name + " with salary " + salary);
    }
}

public class Copyconstructor {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Piyush", 100000);
        emp1.displayInfo();

        Employee emp2 = new Employee(emp1);
        emp2.name = "Akshada";
        emp2.salary = 300000;
        emp2.displayInfo();

    }
}
