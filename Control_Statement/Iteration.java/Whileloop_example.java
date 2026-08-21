public class Whileloop_example {
    public static void main(String[] args) {
        
        int a = 1;
        while(a <= 5) {
            System.out.println(a);
            a++;
        }

        //Find even number 0 to 100
        int b = 2;
        while(b <= 100){
            if(b % 2 == 0) {
                System.out.println(b);
               
            }   b++;
        }

    }
}
