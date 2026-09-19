class Student{
    String name;
}

public class Callbyreference {

    public static void changeValue(Student s) {
        s.name = "Pratik";
        System.out.println("Inside changeValue: " + s.name); //Pratik
    }
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Pranav";
        System.out.println("Before changeValue: " + s1.name); //Pranav
        changeValue(s1);
        System.out.println("After changeValue: " + s1.name); //Pratik
    }
}
