package ss3_java_overview_exercise;

import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào sô a:   ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số b:   ");
        int b = scanner.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = a / (double) b;
        System.out.printf(" %d + %d = %d\n ", a, b, tong);
        System.out.printf(" %d - %d = %d\n ", a, b, hieu);
        System.out.printf(" %d * %d = %d\n ", a, b, tich);
        System.out.printf(" %d / %d = %.2f\n ", a, b, thuong);
    }
}
