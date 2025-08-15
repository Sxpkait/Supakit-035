import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่า fahrenheit
        System.out.print("กรุณากรอกอุณหภูมิ (fahrenheit): ");
        double fahrenheit = scanner.nextDouble();

        // แปลงเป็น celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // แสดงผลลัพธ์
        System.out.printf("อุณหภูมิ %.2f deg F เท่ากับ %.2f deg C\n", fahrenheit, celsius);

        scanner.close();
    }
}
