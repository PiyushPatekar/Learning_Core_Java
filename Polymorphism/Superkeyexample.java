class Employee{
    int salary = 30000;

   
}

class Manager extends Employee{
    int salary = 60000;

    void getDetails() {
        System.out.println("Salary Manager: " + salary);
        System.out.println("Salary Employee: " + super.salary);
    }
}

public class Superkeyexample {
    
    public static void main(String[] args) {
        
    }
}
