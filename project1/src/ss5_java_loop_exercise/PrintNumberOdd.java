package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * In dãy số lẻ từ 1 đến n
 */
public class PrintNumberOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào n:  ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
