package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * Tìm Ước chung lớn nhất và Bội chung nhỏ nhất của 2 số nguyên dương
 */
public class EstimatesAndMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào số A: ");
        int a = scanner.nextInt();

        System.out.print("Hãy nhập vào số B: ");
        int b = scanner.nextInt();

        int valueA = a;
        int valueB = b;


//        int ucln = 0;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        int ucln = a;


        int bcnn = Math.abs(valueA * valueB) / ucln;

        System.out.println("Ước chung lớn nhất: " + ucln);
        System.out.println("Bội chung nhỏ nhất: " + bcnn);
    }
}