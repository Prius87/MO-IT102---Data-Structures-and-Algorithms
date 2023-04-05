import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercise {
   
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>(); // create a new queue to hold customers
        Scanner input = new Scanner(System.in);
        String customerName;

        // prompt the user to enter their name to join the line
        while (true) {
            System.out.print("Enter your name (or 'exit' to quit): ");
            customerName = input.nextLine();

            if (customerName.equalsIgnoreCase("exit")) {
                break; // exit the loop if the customer enters "exit"
            }

            // add the customer to the end of the queue
            line.add(customerName);
            System.out.println("You have joined the line. There are " + line.size() + " customers ahead of you.");
        }

        // serve the customers in the order they joined the line
        System.out.println("\n-- Serving customers --");
        for (String currentCustomer : line) {
            System.out.println("Now serving " + currentCustomer + ". There are " + (line.size() - 1) + " customers ahead of you.");
        }

        System.out.println("No more customers in line.");
    }
}
