public class Operatorexample{
    public static void main(String[] args) {
        //Arthematic Operators

        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        //Relational Operators

        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 != num2);
        System.out.println(num1 == num2);

        //Logical Operators

        boolean a = true;
        boolean b = true;

        System.out.println(a & b);
        System.out.println(a | b);

        //Uniary Operator

        int num = 7;
        int result = num++;
        System.out.println(result); //7
        System.out.println(num); //8

        result = ++num;
        System.out.println(result);
        System.out.println(num);
        
    }
}
