package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * Kiểm tra số nguyên dương
 */
public class CheckPositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím: ");
        int n = scanner.nextInt();


        int reversed = 0;
        int original = n;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (original == reversed) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }


        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }


        boolean isIncreasing = true;
        int lastDigit = 10;
        temp = n;

        while (temp > 0) {
            int currentDigit = temp % 10;
            if (currentDigit >= lastDigit) {
                isIncreasing = false;
                break;
            }
            lastDigit = currentDigit;
            temp /= 10;
        }

        if (isIncreasing) {
            System.out.println(n + " có chữ số tăng dần.");
        } else {
            System.out.println(n + " không có chữ số tăng dần.");
        }


    }
}