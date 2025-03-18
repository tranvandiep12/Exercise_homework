package ss6_java_method_exercise;

import java.util.Scanner;

/**
 * Nhập và in thông tin nhân viên
 */
public class PrintStudentInformation {

    static String[] name = new String[5];
    static int[] age = new int[5];
    static String[] position = new String[5];
    static double[] salary = new double[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào số lượng nhân viên: ");
        int n = scanner.nextInt();


        if(n > 5 || n < 0){
            System.out.println("Vui lòng nhập lại số lượng nhân viên <= 5!");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho nhân viên " + (i + 1) + ":");
            printSv(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin nhân viên " + (i + 1) + ":");
            outputSv(i);
        }
        scanner.close();
    }

    public static void printSv(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tên nhân viên: ");
        name[n] = scanner.nextLine();
        System.out.print("Hãy nhập tuổi nhân viên: ");
        age[n] = scanner.nextInt();
        System.out.print("Hãy nhập chức vụ: ");
        position[n] = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Hãy nhập lương nhân viên: ");
        salary[n] = scanner.nextDouble();
    }
    public static void outputSv(int n){
        System.out.println("Tên nhân viên là: " + name[n]);
        System.out.println("Tuổi nhân viên là: " + age[n]);
        System.out.println("Chức vụ nhân viên là: " + position[n]);
        System.out.println("Lương nhân viên là: " + salary[n]);
    }

}
