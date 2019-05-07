import java.util.Scanner;

public class mulDArrays {
    public static void main(String[] args) {
        int i,j;
        int[][] values = new int[3][3];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers");

        for(i = 0;i<3;i++) 
        {
            for(j=0;j<3;j++) 
            {
                values[i][j] = input.nextInt();
            }
        }
        for(i = 0;i<3;i++) 
        {
            for(j=0;j<3;j++) 
            {
                System.out.println(values[i][j]);
            }
        }
    }
}