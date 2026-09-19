class Outer {
    void show() {
        class Inner {
            void display() {
                System.out.println("Hello, World!");
            }
        }
        Inner Inner = new Inner();
        Inner.display();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        
        Outer obj = new Outer();
        obj.show();

    }
}
