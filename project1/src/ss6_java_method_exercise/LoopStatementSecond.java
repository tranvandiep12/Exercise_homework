import java.util.Scanner;

/**
 * Câu lệch lặp
 * S = 1 + 2 + ... + n
 * S = 1^2 + 2^2 + ... + n^2
 * S = 1 + 1/2 + ... + 1/n
 * S = 1 * 2 * ... * n
 * S = 1! + 2! + ... + n!
 */
public class LoopStatementSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();


        double sumA = calculateSumA(n);
        double sumB = calculateSumB(n);
        double sumC = calculateSumC(n);
        double sumD = calculateSumD(n);
        double sumE = calculateSumE(n);

        System.out.println("S =  " + sumA);
        System.out.println("S =  " + sumB);
        System.out.println("S =  " + sumC);
        System.out.println("S =  " + sumD);
        System.out.println("S =  " + sumE);
    }

    // Tính tổng S = 1 + 2 + ... + n
    public static double calculateSumA(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Tính tổng S = 1^2 + 2^2 + ... + n^2
    public static double calculateSumB(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    // Tính tổng S = 1 + 1/2 + ... + 1/n
    public static double calculateSumC(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // Tính giai thừa S = 1 * 2 * ... * n
    public static double calculateSumD(int n) {
        double product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    // Tính tổng S = 1! + 2! + ... + n!
    public static double calculateSumE(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }

    // Hàm tính giai thừa
    public static double factorial(int n) {
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}