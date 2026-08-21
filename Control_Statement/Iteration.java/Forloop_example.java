public class Forloop_example{
    public static void main(String[] args) {
        //Syntax:- 
        // for loop(Initialization; Condition; Iteration)
        // {
        //     "xyz"
        //    }
     
        for (int i = 1; i <= 5; i++) {
            
            System.out.println(i);

        }

        //Enchance for loop example

        int[] num = {10,20,30,40,50};

        for (int n : num) {
            System.out.println(n);
        }

        //Print all even number between 0 to 100
        
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0)
            System.out.println(i);
        }


    }
}