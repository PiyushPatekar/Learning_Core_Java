import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[] args) {
        
        //      --key--  --Value--
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Pranav");
        map.put(102, "Pratik");
        map.put(103, "Piyush");
        map.put(104, "Akshada");

        System.out.println(map.get(102));
        System.out.println(map.containsKey(102));
        System.out.println(map);
        
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));

        }



    }
}
