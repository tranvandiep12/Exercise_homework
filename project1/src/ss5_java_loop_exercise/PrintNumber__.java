package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * In dãy số 2,-4,6,8,-10,12,14,16,-18,...n
 */
public class PrintNumber__ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím:  ");
        int n = scanner.nextInt();

        int count = 0;
        int distance = 1;
        for (int i = 2; i <= n; i += 2) {
            if (count == distance) {
                // distance = 2;
                System.out.print(-i + " ");
                count = 0;
                distance++;
            } else {
                System.out.print(i + " ");
                count++;
            }

        }
    }
}
