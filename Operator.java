
import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a width: ");
        int width = scanner.nextInt();

        System.out.print("Enter a length: ");
        int length = scanner.nextInt();

        int area = width * length;

        System.out.println("Area is: " + area);
    }
}
