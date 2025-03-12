package ss6_java_method_exercise;

import java.util.Scanner;

/**
 * Kiểm tra n có phải là số nguyên tố hay không
 *
 * Tổng các chữ số nguyên tố
 *
 * n = 12345 ---> 10
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào n: ");
        int n = scanner.nextInt();

//        if (checkNt(n)) {
//            System.out.println(n + " là số nguyên tố");
//        } else {
//            System.out.println(n + " không phải là số nguyên tố");
//        }

        int tong = calTotalPrime(n);
        System.out.println("Tổng số nguyên tố là: " + tong);

    }

    public static boolean checkNt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calTotalPrime(int n) {

        int total = 0;
        while (n != 0) {
            if (checkNt(n % 10)) {
                total += n % 10;
            }
            n /= 10;
        }
        return total;
    }
}



