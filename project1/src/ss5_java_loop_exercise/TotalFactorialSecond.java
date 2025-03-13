package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * Tinh tổng giai thừa của 3 số nguyên dương
 */
public class TotalFactorialSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào soA: ");
        int a = scanner.nextInt();
        System.out.print("Hãy nhập vào soB: ");
        int b = scanner.nextInt();
        System.out.print("Hãy nhập vào soC: ");
        int c = scanner.nextInt();

        int valueA = 1;
        int valueB = 1;
        int valueC = 1;

        for (int i = 1; i <= a; i++) {
            valueA *= i;
        }
        for (int i = 1; i <= b; i++) {
            valueB *= i;
        }
        for (int i = 1; i <= c; i++) {
            valueC *= i;
        }

        int S = valueA + valueB + valueC;
        System.out.println("Tổng là: " + S);
    }
}
