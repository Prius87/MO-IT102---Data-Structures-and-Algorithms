import java.util.Stack;

public class StackExercise2 {

    public static void main(String[] args) {

        Stack<String> students = new Stack<String>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        while(!students.isEmpty()){
            String popped = students.pop();
            System.out.println(popped);
        }
        System.out.println(students.isEmpty());
    }
    
}
