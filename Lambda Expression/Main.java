@FunctionalInterface
interface MyInterface {

    public void sayHello();

}

public class Main{
    public static void main(String[] args) {
        
        //Without Lambda Expression
        MyInterface obj = new MyInterface(){
            public void sayHello(){
                System.out.println("Hello without Lambda Expression");
            }
        };
        obj.sayHello();

        // Lambda Expression
        MyInterface obj2 = ()->{
                System.out.println("Hello with Lambda Expression");
        };
        obj2.sayHello();

    }
}