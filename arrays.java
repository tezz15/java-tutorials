import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] values;
        values = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five integers:");
       
        for(int i=0;i<values.length;i++)
        {
            values[i] = input.nextInt();
        }
        for(int i=0;i<values.length;i++) 
        {
            System.out.println(values[i]);
        }
    }
}