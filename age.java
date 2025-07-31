
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you Year of birth: ");
        int Year = input.nextInt();

        System.out.print("Enter Current year: ");
        int pe = input.nextInt();

        int age = pe - Year;
        System.out.println("your age is " + age);
        input.close();
    }
}