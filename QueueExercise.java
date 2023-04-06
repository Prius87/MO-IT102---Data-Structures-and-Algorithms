import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercise {
   
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>(); 
        Scanner input = new Scanner(System.in);
        String customerName;

        while (true) {
            System.out.print("Enter your name (or 'exit' to quit): ");
            customerName = input.nextLine();

            if (customerName.equalsIgnoreCase("exit")) {
                break; 
            }

           
            line.add(customerName);
            System.out.println("You have joined the line. There are " + line.size() + " customers ahead of you.");
        }

      
        System.out.println("\n-- Serving customers --");
        for (String currentCustomer : line) {
            System.out.println("Now serving " + currentCustomer + ". There are " + (line.size() - 1) + " customers ahead of you.");
        }

        System.out.println("No more customers in line.");
    }
}
