public class Builderexample {
    public static void main(String[] args) {
        
    //String-Buffer examples.
    StringBuilder sb = new StringBuilder("Piyush");
    
    //append - join existing string at end
    sb.append(" Patekar"); //Piyush Patekar

    //insert - insert text at specific position
    sb.insert(0,"Hello "); //Hello Piyush Patekar

    //delete - remove characters
    sb.delete(4,6); //Piyu Patekar

    //replace - replace the text
    sb.replace(0, 5, "Pratik"); //Pratik
    sb.replace(1, 6, "t"); //Pt

    //reverse - reverse the object
    sb.reverse();
    System.out.println(sb.reverse());//hsuyiP
    
    System.out.println(sb.length());//6

    System.out.println(sb);


    }
}
