import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//       1. REVERSE STRING
        System.out.println("REVERSED STRING");

        System.out.println("Enter a string: ");
        String userString = input.nextLine();
        System.out.println("Reversed:");
        for (int i = userString.length() - 1; i >= 0; i--) {
            System.out.print(userString.charAt(i));
        }
        System.out.println();//linebreak

//       2. 10 INTEGER VALUES NO DUPLICATES
        System.out.println("REMOVING DUPLICATES");

        ArrayList<Integer> numList = new ArrayList<Integer>();
        int userNum;

        System.out.println("Enter 10 values");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Number %d:\n", i+1);
            userNum = input.nextInt();
            numList.add(userNum); //add numbers to arraylist
        }

       boolean noDuplicates = false;

        while (!noDuplicates) {
            noDuplicates = true;
            for (int i = 0; i < numList.size() -1 ; i++){
               for (int j = 0; j < numList.size() - 1 -i; j++){
                   if (numList.get(i) == numList.get(i+1)){
                       numList.remove(i+1); //remove duplicates
                       noDuplicates = false;
                   }
               }

           }
        }


        System.out.println("Array List no Duplicates");
        for (int i: numList){       //print array
            System.out.print(i + " ");
        }
        System.out.println();//linebreak


//        3. SUM 13 ARRAY
        System.out.println("PAIRS THAT EQUAL 13");
        int [] arrayOne = {1,7,6,5,9};
        int [] arrayTwo = {2,7,6,3,4};

        System.out.println("Pairs that equal 13 for arrayOne");
        for (int i = 0; i < arrayOne.length; i++){
            for (int j = 0; j < arrayOne.length; j++){
                if (arrayOne[i] + arrayTwo[j] == 13){
                    //add to array list or print from here
                    System.out.println(arrayOne[i] + "," + arrayTwo[j]);
                }
            }
        }

//        4. EVEN AND ODD VALUES IN ARRAY
        System.out.println("Even and Odd values in array");

        int[] evenOrOddArray = new int[10];

        userNum = 0;
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
        for (int i: numList){
            if (i % 2 ==0)
                System.out.print(i+ " ");
        }
        System.out.println();//linebreak


        // Printing odd numbers
        int oddCount = 0;
        System.out.println("Odd numbers: ");
        for (int i: numList){
            if (i % 2 !=0)
                System.out.print(i+ " ");
        }
        System.out.println();//linebreak


//        5. ENTER STRING RETURN EACH WORD LENGTH

        userString = input.nextLine();//buffer


        System.out.println("Enter a string (max number of characters is 132");
        userString = input.nextLine();

        //Print out original string
        System.out.println("You entered " + userString);

        //split string into an array
        String [] userWords = userString.split(" ");
        System.out.println(Arrays.toString(userWords));


        //print length of each element in the array
        for (int i = 0; i < userWords.length; i++){
            System.out.println(userWords[i] + " has " + userWords[i].length() + " characters." );
        }




    }//main
}//class
