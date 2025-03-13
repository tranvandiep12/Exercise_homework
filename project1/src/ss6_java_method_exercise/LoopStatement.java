import java.util.Scanner;

public class LoopStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();

        // Kiểm tra và in ra kết quả
        System.out.println(n + (isSymmetricalNumber(n) ? " là số đối xứng." : " không phải là số đối xứng."));
        System.out.println(n + (isSquareNumber(n) ? " là số chính phương." : " không phải là số chính phương."));
        System.out.println(n + (isPrimeNumber(n) ? " là số nguyên tố." : " không phải là số nguyên tố."));
        OddTotal(n);  // Gọi phương thức tổng số lẻ
        System.out.println("Tổng các chữ số nguyên tố: " + calculateTotalPrimeDigits(n));
    }

    // Trả về số đảo
    public static int reversedNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // Kiểm tra số đối xứng
    public static boolean isSymmetricalNumber(int n) {
        return n == reversedNumber(n);
    }

    // Kiểm tra số chính phương
    public static boolean isSquareNumber(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    // Kiểm tra số nguyên tố
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Tổng số lẻ
    public static void OddTotal(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                s += i;
            }
        }
        System.out.println("Tổng số lẻ: " + s);
    }

    // Tổng các chữ số nguyên tố
    public static int calculateTotalPrimeDigits(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (isPrimeNumber(digit)) {
                total += digit;
            }
            n /= 10;
        }
        return total;
    }
}