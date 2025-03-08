package ss4_condision_exercise;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào a:  ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào b:  ");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;

        System.out.println("Max là:  " + max);
        System.out.println("Min là:  " + min);
    }
}
