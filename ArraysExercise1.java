public class ArraysExercise1 {

    public static void main(String[] args) {
        
        int [] num = {25,4,16,9,10};

        int sum = 0;

        for (int i=0; i < num.length; i++){

            sum += num[i];
        }

            System.out.println("The total sum of the array is " + sum);
    }
}
