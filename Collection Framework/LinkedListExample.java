import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList();
        list.add("Pranav");
        list.add("Piyush");
        list.add("Akshada");
        list.add("Payal");
        list.add("Gaurav");

        list.getFirst();
        list.remove();
        
        System.out.println(list.addAll(3, list));
        //System.out.println(list);  
        
        LinkedList<String> lang2 = new LinkedList<>();
        lang2.add("Up");
        lang2.add("Down");
        lang2.add("Right");
        lang2.add("Left");
        lang2.addAll(list);
        System.out.println(lang2);

        //System.out.println(lang.removeAll(lang2));
        
        

    }
}
