//Base class - Parent class
class Employee {

    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary; //Default logic
     }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + calculateSalary());
    }
}

//Derived class - Child class
class FulltimeEmployee extends Employee{

    double bonus;

    @Override 
    public double calculateSalary() {
        return baseSalary + bonus; // Custom logic for FulltimeEmployee
    }
}

//Derived class - Child class
class ParttimeEmployee extends Employee{
    
    double hourRate;
    int hoursWorked;

    @Override
    public double calculateSalary(){
        return hourRate * hoursWorked; // Custom logic for FulltimeEmployee
    }
}

//Derived class - Child class
class TemporaryEmployee extends Employee{
    
    double dailyworkRate;
    int daysWorked;

    @Override
    public double calculateSalary(){
        return dailyworkRate * daysWorked; // Custom logic for FulltimeEmployee
    }

}

public class Overridingmethod {
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.name = "Piyush";
        emp.baseSalary = 100000;
        emp.displayDetails();

        FulltimeEmployee FulltimeEmp = new FulltimeEmployee();
        FulltimeEmp.name = "Akshada";
        FulltimeEmp.baseSalary = 300000;
        FulltimeEmp.bonus = 8000;
        FulltimeEmp.displayDetails();

        ParttimeEmployee PartimeEmp = new ParttimeEmployee();
        PartimeEmp.name = "Ayush";
        PartimeEmp.hourRate = 150;
        PartimeEmp.hoursWorked = 6;
        PartimeEmp.displayDetails();

        TemporaryEmployee temporaryEmp = new TemporaryEmployee();
        temporaryEmp.name = "Savita";
        temporaryEmp.dailyworkRate = 900;
        temporaryEmp.daysWorked = 21;
        temporaryEmp.displayDetails();
    }
}
