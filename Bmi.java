import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("กรุณากรอกน้ำหนัก (weight): ");
        double weight = scanner.nextDouble();

        System.out.print("กรุณากรอกความสูง (height): ");
        double height = scanner.nextDouble();

        // คำนวณ BMI
        double bmi = weight / (height * height);

        // แสดงผลลัพธ์ (ไม่แสดงคำแปล)
        System.out.printf("ค่า BMI ของคุณคือ: %.2f\n", bmi);

        scanner.close();
    }
}
