package BasicOfJava;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number;   //can also generate double/boolean number
        number = rand.nextInt(1,101);
        System.out.println(number);
    }
}
