package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * Tính tổng s = 1 + 1/3! + 1/5! + 1/(2n-1)!
 */
public class TotalFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            int fact = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                fact *= j;
            }

            sum += 1.0 / fact;
        }

        System.out.println("Tổng là: " + sum);
    }
}
