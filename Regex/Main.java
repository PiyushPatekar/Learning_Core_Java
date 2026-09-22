public class Main{

    public static void main(String[] args) {
        
        String email = "test12$3@gmail.com";
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        if (email.matches(regex)) {
            System.out.println("Valid email");
        } else {
        System.out.println("Invalid emai1");

     }
    }
}
