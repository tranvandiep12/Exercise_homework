package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * In dãy số chẵn từ 2 đến n với giá trị dương âm xen kẽ mỗi 3 số
 */
public class PrintNumber3NumbersAlternating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào n:  ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            if (i % 6 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
