public class whileLoops {
    public static void main(String[] args) {
        int value = 23;
        boolean decision = value > 21;
        
        System.out.println(decision);
        while (value > 21) {
            System.out.println(value);
            value -= 1;
        }
    }
}