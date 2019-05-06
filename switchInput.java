import java.util.Scanner;

public class switchInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a command among start, stop , pause");
        String line = input.nextLine();

        switch(line) {
            case "start":
                System.out.println("System started.");
                break;
            
            case "stop":
                System.out.println("System stopped.");
                break;
            
            case "pause":
                System.out.println("System paused.");
                break;
            //and so on;
        }
    }
}