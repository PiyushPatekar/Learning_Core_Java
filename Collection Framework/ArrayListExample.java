
import java.util.Vector;

public class ArrayListExample {

    public static void main (String[] args){

        // Using String Datatype(Wrapper Class)
        Vector<String> names = new Vector<>();
        names.add("Pranav");
        names.add("Gaurav");
        names.add("Piyush");
        names.add("Akshada");

        System.out.println(names.get(0));
        names.remove(1);
        System.out.println(names);

        // Using Integer Datatype(Wrapper Class)
        Vector<Integer> age = new Vector<>();
        age.add(21);
        age.add(18);
        age.add(20);
        age.add(16);

        System.out.println(age);

        for (String num : names) {
            System.out.println(num);
        }
        

        Vector<String> lang = new Vector<>();
        lang.add("HTML");
        lang.add("CSS");
        lang.add("C#");
        lang.add("C++");
        lang.add("HTML");

        System.out.println(names.get(0));
        names.remove(1);
        System.out.println(lang);
        System.out.println(lang.size());
        System.out.println(lang.contains("HTML"));
        System.out.println(lang.isEmpty());
        System.out.println(lang.indexOf("CSS"));
        System.out.println(lang.lastIndexOf("HTML"));
        
        // ArrayList<String> lang2 = new ArrayList<>();
        // lang2.add("Up");
        // lang2.add("Down");
        // lang2.add("Right");
        // lang2.add("Left");
        // lang2.addAll(lang);
        // System.out.println(lang2);

        //System.out.println(lang.removeAll(lang2));


        Object[] arr = lang.toArray();
        System.out.println(Arrays.toString(arr));

    }
}