import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลความกว้าง และความยาว
        System.out.print("กรุณากรอกความกว้าง (cm): ");
        double width = scanner.nextDouble();

        System.out.print("กรุณากรอกความยาว (cm): ");
        double length = scanner.nextDouble();

        // คำนวณหา bodySurfaceArea
        double bodySurfaceArea = (width * length) / 360;

        // แสดงผลลัพธ์
        System.out.printf("Body Surface Area คือ: %.2f ตารางเมตร\n", bodySurfaceArea);

        scanner.close();
    }
}
