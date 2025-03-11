package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * Tính tổng S = 1 + 1/2 + 1/3 .... + 1/n;
 */
public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím: ");

        int n = scanner.nextInt();

        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + 1.0 / i;
        }
        System.out.println("Tổng là:  " + s);
    }
}
