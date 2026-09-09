class calculator{
     public int add(int a , int b){
         return a+b;
     }
    
     public int add(int a, int b, int c){
         return a + b + c;
     }
    
     public double add(double a, double b){
         return a + b;
     }

     public double add(double a, double b, double c){
         return a + b + c;
     }

    public void add(String a, int b){
        System.out.println(a + b);
    }

    public void add(int a, String b){
        System.out.println(a + b);
    }
}

public class Overloadingadd {
    public static void main(String[] args) {
        calculator calc = new calculator();
         System.out.println(calc.add(10, 20));
         System.out.println(calc.add(10, 20, 30));
         System.out.println(calc.add(20, 50.6));
         System.out.println(calc.add(10.2, 10.3, 4.5));

       calc.add(10, "10");
    }
}