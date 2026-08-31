public class Stringexample {
    public static void main(String[] args) {

        // Stringexample.java

        String a = "Piyush";
        String b = "Piyush";
        System.out.println(a == b); // True

        String name1 = new String("Piyush");
        String name2 = new String("Piyush");
        System.out.println(name1 == name2); //False

        System.out.println(name1.equals(name2)); //True


        String ab = "Pranav";
        ab = ab.concat("Java");
        System.out.println(ab);

        //

        String str = "Piyush    ";

        //length()
        System.out.println(str.length()); // 6

        //toLowerCase()
        System.out.println(str.toLowerCase()); // piyush

        //toUpperCase()
        System.out.println(str.toUpperCase()); //PIYUSH

        //trim()
        System.out.println(str.trim() + "'"); //Piyush'

        //replace()
        System.out.println(str.replace('h', 'o')); // piyuso

        //startsWith()
        System.out.println(str.startsWith("test")); //false

        //charAt()
        System.out.println(str.charAt(2)); // y

        //indexOf()
        System.out.println(str.indexOf("h"));



    }
}