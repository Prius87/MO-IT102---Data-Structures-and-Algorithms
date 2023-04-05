import java.util.Scanner;

public class ArraysExercise3 {
    
    public static void main(String[] args) {
        
        int [] num = new int [5];

        int sum =0;

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter 5 intefer elements for the Array");


        for (int i=0; i < num.length; i++){
                System.out.println("Enter value #" + (i+1) + ": ");
                num[i] = scr.nextInt();
        }


        for (int i=0; i<num.length; i++){
            sum += num[i];
        }

        System.out.println("Sum of the array is " + sum);

    }

}
