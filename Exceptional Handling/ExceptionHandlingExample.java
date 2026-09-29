public class ExceptionHandlingExample {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int arr[] = { 1, 2, 3 };

            // int result = a / b;
            // System.out.println("Result: " + result);
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block is always executed");
        }

    }
}