class Outer {
    private int num = 10;

    class Inner {
        void display() {
            System.out.println("The value of num is: " + num);
        }
    }
}

public class MemberInnerClass {
    
    public static void main(String[] args) {
        
        
        Outer obj = new Outer();
        Outer.Inner objInner = obj.new Inner();
        objInner.display();
    }
    
}