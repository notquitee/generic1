package pl.edu.agh;

public class Main {

    public static void main(String[] args) {
	    Box<Integer> integerBox;
        integerBox = new Box<Integer>();
     //   integerBox.add("10");     //error -> string
        integerBox.add(new Integer(10));
        Integer someInteger = (Integer) integerBox.get();
        System.out.println(someInteger);
    }
}
