package ss6_java_method_exercise;

import java.util.Scanner;

/**
 * Tìm ước chung lớn nhất
 */
public class Ucln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào số A: ");
        int a = scanner.nextInt();
        System.out.print("Hãy nhập vào số B: ");
        int b = scanner.nextInt();


        int result = ucln(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + result);
    }

    public static int ucln(int a, int b) {

        if (a == 0) return b;
        if (b == 0) return a;


        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}