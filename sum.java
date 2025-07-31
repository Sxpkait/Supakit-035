import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter num1: ");
            int num1 = input.nextInt();

            System.out.print("Enter num2: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;

            System.out.println("ผลบวกของ " + num1 + " และ " + num2 + " คือ " + sum);
        }
    }
}
