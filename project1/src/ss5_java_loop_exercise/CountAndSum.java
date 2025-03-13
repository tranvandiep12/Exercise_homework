package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * Đếm và tính tổng các số đối xứng , chính phương, nguyên tố trong đoạn a , b
 */
public class CountAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào soA: ");
        int a = scanner.nextInt();

        System.out.print("Hãy nhập vào soB: ");
        int b = scanner.nextInt();


        int soLuongSoDoiXung = 0;
        int tongSoDoiXung = 0;

        int soLuongSoChinhPhuong = 0;
        int tongSoChinhPhuong = 0;


        int soLuongSoNguyenTo = 0;
        int tongSoNguyenTo = 0;

        // Kiểm tra số đối xứng
        for (int n = a; n <= b; n++) {
            String str = Integer.toString(n);
            boolean isPalindrome = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                soLuongSoDoiXung++;
                tongSoDoiXung += n;
            }
            //kiểm tra số chính phương
            if (Math.sqrt(n) % 1 == 0) {
                soLuongSoChinhPhuong++;
                tongSoChinhPhuong += n;
            }
            // Kiểm tra số nguyên tố
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                soLuongSoNguyenTo++;
                tongSoNguyenTo += n;
            }
        }
        System.out.printf("Số đối xứng trong đoạn [%d, %d]: %d\n", a, b, soLuongSoDoiXung);
        System.out.printf("Tổng số đối xứng trong đoạn [%d, %d]: %d\n", a, b, tongSoDoiXung);
        System.out.printf("Số chính phương trong đoạn [%d, %d]: %d\n", a, b, soLuongSoChinhPhuong);
        System.out.printf("Tổng số chính phương trong đoạn [%d, %d]: %d\n", a, b, tongSoChinhPhuong);
        System.out.printf("Số nguyên tố trong đoạn [%d, %d]: %d\n", a, b, soLuongSoNguyenTo);
        System.out.printf("Tổng số nguyên tố trong đoạn [%d, %d]: %d\n", a, b, tongSoNguyenTo);
    }
}
