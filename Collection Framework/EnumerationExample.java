import java.util.Enumeration;
import java.util.Hashtable;
 
public class EnumerationExample {
 
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(101, "Pranav");
        map.put(102, "Pratik");
        map.put(103, "Pravin");
 
        Enumeration<Integer> keys = map.keys();
 
        while (keys.hasMoreElements()) {
            Integer id = keys.nextElement();
            System.out.println(id);
 
        }

        
        Enumeration<String> value = map.elements();
 
        while (value.hasMoreElements()) {
            String name = value.nextElement();
            System.out.println(name);
 
        }
 
        // for (Integer key : map.keySet()) {
        // System.out.println(key + " : " + map.get(key));
        // }
 
    }
 
}