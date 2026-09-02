
public class Methodtypes {

    //Method without return type
    void displayMsg() {
        System.out.println("This is method");
        System.out.println("Welcome Student");
        }

    //Method with return and without parameter type
    int add() {
        int a = 4;
        int b = 5;
        int result = a + b;
        return result;
        }

    //Method with parameter type
    int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    //Static Method
    static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        
        // void means nothing is written
        // You cannot return values in void method


        //Method without return type
        Methodtypes ob = new Methodtypes();
        ob.displayMsg();

        //Method with return type
        Methodtypes obj = new Methodtypes();
        System.out.println(obj.add());

        //Method with parater type
        Methodtypes object = new Methodtypes();
        System.out.println(obj.add(5,5));
        System.out.println(obj.add(7,1));

        //Static Method
        System.out.println(addition(15,20));

    }
}