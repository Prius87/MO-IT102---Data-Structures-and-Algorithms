import java.util.LinkedList;

public class LinkedLists {
    
    public static void main(String[] args) {

        // LinkedLists cat = new LinkedLists();

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cheery");


        // to print the list
        System.out.println(fruits);

        // to add orange at the start if the list
        fruits.addFirst("Orange");
        System.out.println(fruits);

        //remove an element from the list
        fruits.remove(1);
        System.out.println(fruits);

        // get an element at a specific index
        String getfruit = fruits.get(1);
        System.out.println("Element at index 1 = " + getfruit);

        // size of the list
        int size = fruits.size();
        System.out.println("Size of the list = " + size);

    }
}
