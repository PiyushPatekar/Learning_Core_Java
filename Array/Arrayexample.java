public class Arrayexample {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr.length);

        //for loop example
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        //Enchanced for loop example
        for (int num : arr) {
            System.out.println(num);
        }

        //2D Array example
        int [] [] matrix = {{10,20,30}, {40,50,60}};
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i]);
        }



    }
}
