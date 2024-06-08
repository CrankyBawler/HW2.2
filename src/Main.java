import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public static void random (){
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
                int i = random.nextInt(diff+1);
        i += min;
    }
}