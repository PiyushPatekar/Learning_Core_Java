// Static Nested Class
class OuterClass {
    static int num = 10;

    static class InnerClass {
        void display() {
            System.out.println("Value of num: " + num);
        }
    }
}

// Java Nested Interface
class OuterClass2 {

    interface Message {
        void display();
    }
}

class Demo implements OuterClass2.Message {
    public void display() {
        System.out.println("Nested Interface Example");
    }
}

public class StaticNestedClass {

    public static void main(String[] args) {

        // Static Nested class
        OuterClass.InnerClass obj = new OuterClass.InnerClass();

        obj.display();

        // Java Interface class
        Demo obj2 = new Demo();
        obj.display();

    }
}