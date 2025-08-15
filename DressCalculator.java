import java.util.Scanner;

public class DressCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("Enter price of one dress : ");
        double price = sc.nextDouble();

        System.out.print("Enter number of dresses to buy : ");
        int quantity = sc.nextInt();

        System.out.print("Enter Discount : ");
        double discountPercent = sc.nextDouble();

        // คำนวณราคารวม
        double totalCost = price * quantity;

        // คำนวณส่วนลด
        double discountAmount = totalCost * (discountPercent / 100);

        // คำนวณราคาสุทธิ
        double netPay = totalCost - discountAmount;

        // แสดงผล
        System.out.println("---------------------------------");
        System.out.printf("Total cost = %.2f Bath%n", totalCost);
        System.out.printf("discountAmount = %.2f baht%n", discountAmount);
        System.out.printf("Net pay = %.2f Bath%n", netPay);

        sc.close();
    }
}
