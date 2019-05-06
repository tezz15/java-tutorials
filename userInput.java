import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);
        
        //output the prompt
        System.out.println("Enter a line of text:");

        //wait for the user to input the line of text
        String line = input.nextLine();

        //show the input of the user to the user
        System.out.println(line);
        
        //int integer = input.nextInt();  for integer
    }
}