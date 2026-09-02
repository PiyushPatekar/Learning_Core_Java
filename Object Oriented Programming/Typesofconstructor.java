class Employee {
  private int id;
  private String name;

  //Default Constructor
  public Employee() {
    id = 0;
    name = "Default Value";
  }

  //Paramaterized Constructor
  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  //Copy Constuctor
  Employee(Employee emp) {
    this.id = emp.id;
    this.name = emp.name;
    System.out.println("Copy constructor called");
  }

  //Methods
  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

}

public class Typesofconstructor {
  public static void main(String[] args) {
    Employee pratik = new Employee();

    pratik.setId(1);
    pratik.setName("Pratik Patil");

    System.out.println("Id : " + pratik.getId());
    System.out.println("Name : " + pratik.getName());

    // Parameterized Constructor
    Employee harshit = new Employee(2, "harshit");

    System.out.println("Id : " + harshit.getId());
    System.out.println("Name : " + harshit.getName());

    // Copy Constructor
    Employee CopyEmp = new Employee(pratik);
    System.out.println("Copied Id : " + CopyEmp.getId());
    System.out.println("Copied Name : " + CopyEmp.getName());

  }
}
