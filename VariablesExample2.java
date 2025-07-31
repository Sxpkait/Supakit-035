import java.util.Scanner;

public class VariablesExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 🔹 1. กรอกขนาดเสื้อ
        System.out.print("Enter clothing size (s, m, l): ");
        char clothingSize = input.next().toLowerCase().charAt(0);

        // 🔹 2. กรอกจำนวนผู้เข้าชมเว็บไซต์
        System.out.print("Enter number of website visitors: ");
        int websiteVisitors = input.nextInt();

        // 🔹 3. กรอกเกรดนักศึกษา
        System.out.print("Enter student grade (A, B, C, D, E): ");
        char studentGrade = input.next().toUpperCase().charAt(0);

        // 🔹 4. แปลงเกรดเป็น GPA
        double studentGPA = -1.0;
        switch (studentGrade) {
            case 'A':
                studentGPA = 4.0;
                break;
            case 'B':
                studentGPA = 3.0;
                break;
            case 'C':
                studentGPA = 2.0;
                break;
            case 'D':
                studentGPA = 1.0;
                break;
            case 'E':
                studentGPA = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
        }

        // 🔹 5. ค่าคงที่
        final double PI = 3.14159;
        final int MONTHS_IN_YEAR = 12;

        // 🔹 6. กรอกค่าใช้จ่ายรายปี
        System.out.print("Enter annual expenses: ");
        float annualExpenses = input.nextFloat();

        // 🔹 7. รับเลขสองจำนวน และหาผลรวม
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        // 🔹 8. แสดงผลทั้งหมด
        System.out.println("\n===== OUTPUT =====");
        System.out.println("Clothing Size: " + clothingSize);
        System.out.println("Website Visitors: " + websiteVisitors);
        System.out.println("Student Grade: " + studentGrade);

        if (studentGPA >= 0) {
            System.out.println("Student GPA: " + studentGPA);
        }

        System.out.println("Value of PI: " + PI);
        System.out.println("Annual Expenses: " + annualExpenses);
        System.out.println("Months in a Year: " + MONTHS_IN_YEAR);
        System.out.println("ผลบวกของ " + num1 + " และ " + num2 + " คือ " + sum);

        input.close(); // ปิด Scanner
    }
}
