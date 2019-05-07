public class stringArrays {
    public static void main(String[] args) {
        String[] words = new String[5];

        words[0] = "hello" ;
        words[1] = " to " ;
        words[2] = "the";
        words[3] = "world!";
        words[4] = "I am tej";

        for(int i = 0;i < words.length;i++) 
        {
            System.out.println(words[i]);
        }
    }
}