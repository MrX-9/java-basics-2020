import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your age?");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
    }
}
