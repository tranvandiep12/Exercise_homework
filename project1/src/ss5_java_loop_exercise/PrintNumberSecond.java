package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * In dãy số 1,-3,7,-15,31..n
 */
public class PrintNumberSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím:  ");
        int n = scanner.nextInt();

        int a = 1;

        int b = 1;

        while (a <= n) {
            System.out.print(a * b + " ");

            a = a * 2 + 1;

            b = -b;
        }
    }
}
