public class Licence {
    public static void main(String[] args) {
        int age = 18;
        boolean hasLicence = false;

        if(age >= 18) {
            if(hasLicence) {
                System.out.println("You can Drive");
            } else {
                System.out.println("You need Licence");
            }
        } else {
            System.out.println("You are Underage");
        }
    }
}
