package ss6_java_method_exercise;

import java.util.Scanner;

/**
 * Câu lêch lặp
 */
public class LoopStatement_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào bàn phím: ");
        int n = scanner.nextInt();
        System.out.println("Số đảo ngược là: " + reversedNumber(n));
        if (squareNumber(n)) {
            System.out.println(n + " là số chính phương");
        } else {
            System.out.println(n + " không phải số chính phương");
        }
        symmetricalNumber(n);
        if (symmetricalNumber(n)) {
            System.out.println(n + " là số đối xứng  ");
        } else {
            System.out.println(n + " không phải là số đối xứng ");
        }


        isNumber(n);
        if (isNumber(n)) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải số nguyên tố");
        }

        int totalObbNumber = totalObb(n);
        System.out.println("Tổng các số lẻ là: " + totalObbNumber);

        int totalIsNumber = totalIsNumber(n);
        System.out.println("Tổng các số nguyên tố là: " + totalIsNumber);

        int totalsquarenumber = totalSquareNumber(n);
        System.out.println("Tổng số chinh phương là: " + totalsquarenumber);
    }


    public static int reversedNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean squareNumber(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    public static boolean symmetricalNumber(int number) {
        return number == reversedNumber(number);
    }

    public static boolean isNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int totalObb(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int totalIsNumber(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (isNumber(digit)) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int totalSquareNumber(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (squareNumber(number)) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
