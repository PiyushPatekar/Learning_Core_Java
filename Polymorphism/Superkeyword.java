//1st
// class Parent {

//     String name = "Parent";

// }

// class Child extends Parent {

//     String name ="Child";

// }

//2nd 
// class Parent{
//     Parent() {
//         System.out.println("Parent constructor called");
//     }
// }

// class Child extends Parent{
//     Child() {
//         System.out.println("Child constructor called");
//     }
// }

//3rd
class Employee{

    String company;

    Employee(String company){
        this.company = company;
        System.out.println("Employee constructor called");
    }

    void getDetails(){
        System.out.println(company);
    }
}

class Manager extends Employee{
    String department;


    Manager(String department, String company){
        super(company); //Calls Employee constructor with company name
        this.department = department;
        System.out.println("Manager Constuctor called");
    }

    @Override 
    void getDetails() {
        super.getDetails();
        System.out.println("Department: " + department);
    }
}

public class Superkeyword {
    public static void main(String[] args) {

        Manager manager = new Manager(HR, FCT);

        manager.getDetails();
        
    }
}
