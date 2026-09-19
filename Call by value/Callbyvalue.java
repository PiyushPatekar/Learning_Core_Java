public class Callbyvalue {

    public static void changeValue(int a) {
        a = 10;
        System.out.println("Inside changeValue: " + a); //10
    }

    public static void main(String[] args) {
    
        int a = 5;
        System.out.println("Before changeValue: " + a);//5
        changeValue(a);
        System.out.println("After changeValue: " + a);//5
    }

}