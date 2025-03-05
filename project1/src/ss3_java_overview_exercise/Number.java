package ss3_java_overview_exercise;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn hãy nhập vào bản số xe:   ");
        int n = scanner.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        int buttonNumber = sum % 10;

        System.out.println("Tổng các chữ số của biển số xe là: " + sum);
        System.out.println("Số nút của biển số xe là: " + buttonNumber);
    }
}
