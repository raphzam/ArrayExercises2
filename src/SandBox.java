import java.util.Arrays;
import java.util.Scanner;

public class SandBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userString = "";

        System.out.println("Enter a string (max number of characters is 132");
        userString = input.nextLine();

        //Print out original string
        System.out.println("You entered " + userString);

        //split string into an array
        String [] userWords = userString.split(" ");
        System.out.println(Arrays.toString(userWords));

        for (int i = 0; i < userWords.length; i++){
            System.out.println(userWords[i] + " has " + userWords[i].length() + " characters." );
        }




        //give length of each element in that array
    }
}
