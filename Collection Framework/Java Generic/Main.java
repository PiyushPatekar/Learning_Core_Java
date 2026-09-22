class Box<T> {
    // private Datatype VName
    private T value;

    // Setter Method
    public void setValue(T value){
        this.value = value;
    }

    // Getter Method
    public T getValue() {
        return value;
    }

}


public class Main {
    public static void main(String[] args) {
        
        Box<String> stringObj = new Box();
        stringObj.setValue("Pranav");
        System.out.println(stringObj.getValue());

        Box<Integer> intObj = new Box();
        intObj.setValue(2000);
        System.out.println(intObj.getValue());

    }
}
