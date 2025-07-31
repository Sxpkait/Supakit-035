
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 ");
        int num1 = input.nextInt();

        System.out.print("Enter num2 ");
        int num2 = input.nextInt();

        int plus = num1 + num2;
        int delete = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        System.out.println("ผลบวก " + plus);
        System.out.println("ผลลบ " + delete);
        System.out.println("ผลคูณ " + multiply);
        System.out.println("ผลหาร " + divide);

        input.close();
    }
}
