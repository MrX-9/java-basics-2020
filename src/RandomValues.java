import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(55) + 32; // from 32 to 87
        System.out.println(number);
    }
}
