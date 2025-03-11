package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * In dãy số 1,2,3,4...n
 */
public class PrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào n:  ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
