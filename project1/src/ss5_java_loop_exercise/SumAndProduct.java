package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * Tính tổng và tích các chữ số của 1 số nguyên
 * vd: m = 234 ===> s = 2 + 3 + 4 = 9; 2 * 3 * 4 = 24;
 */
public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím: ");
        int m = scanner.nextInt();

        int s = 0;
        int p = 1;

        while (m > 0) {
            int digit = m % 10;

            s += digit;
            p *= digit;

            m /= 10;
        }
        System.out.println("Tổng là: " + s);
        System.out.println("Tích là: " + p);
    }
}
