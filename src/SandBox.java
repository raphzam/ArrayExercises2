import java.util.Arrays;
import java.util.Scanner;

public class SandBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userString = "";

//        4. EVEN AND ODD VALUES IN ARRAY
        System.out.println("Even and Odd values in array");

        int[] evenOrOddArray = new int[10];

        int userNum = 0;
        System.out.println("Enter 10 numbers");


        //adding numbers to the array
        for (int i = 0; i <10; i++) {
            System.out.printf("Number %d:\n", i+1);
            userNum = input.nextInt();
            evenOrOddArray[i] = userNum;
        }

        //Printing even numbers
        int evenCount = 0;
        System.out.println("Even numbers:");
        for (int i: evenOrOddArray){
            if (i % 2 ==0)
                System.out.print(i+ " ");
        }
        System.out.println();//linebreak


        // Printing odd numbers
        int oddCount = 0;
        System.out.println("Odd numbers: ");
        for (int i: evenOrOddArray){
            if (i % 2 !=0)
                System.out.print(i+ " ");
        }
        System.out.println();//linebreak




        //give length of each element in that array
    }
}
