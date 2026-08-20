public class Grade {
    public static void main(String[] args) {
        int marks = 70;

        if(marks >= 35){
            System.out.println("D - Grade");
        } else if(marks >= 60){
            System.out.println("C - Grade");
        } else if(marks >=80){
            System.out.println("B - Grade");
        } else if(marks >=90){
            System.out.println("A - Grade");
        } else{
            System.out.println("E - Grade - Fail");
        }
    }
    
}
