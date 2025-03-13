package ss6_java_method_exercise;

import java.util.Scanner;

/**
 * Nhập và in thông tin của sinh viên
 */
public class EnterStudentInformation {
    public static String name;
    public static int yearOld;
    public static String gender;
    public static double wage;
    public static double averageScore;

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }

    public static void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        yearOld = Integer.parseInt(scanner.nextLine());


        System.out.print("Nhập vào giới tính: ");
        gender = scanner.nextLine();

        System.out.print("Nhập vào mức lương: ");
        wage = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập điểm trung bình: ");
        averageScore = Double.parseDouble(scanner.nextLine());
    }

    public static void xuatThongTin() {
        System.out.println("Họ và Tên: " + name);
        System.out.println("Tuổi: " + yearOld);
        System.out.println("Giới tính: " + gender);
        System.out.println("Lương: " + wage);
        System.out.println("Điểm trung bình: " + averageScore);
    }
}