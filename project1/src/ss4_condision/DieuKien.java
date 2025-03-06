package ss4_condision;

import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
        /*
         * NHập vào 1 số tự nhiên 1 đến 10 , sau đó in ra tiếng Anh
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHập vào số từ 1 - 10:   ");
        int a = scanner.nextInt();


        if (a == 1) {
            System.out.println("one");
        } else if (a == 2) {
            System.out.println("two");
        } else if (a == 3) {
            System.out.println("tree");
        } else if (a == 4) {
            System.out.println("Four");
        } else if (a == 5) {
            System.out.println("five");
        } else if (a == 6) {
            System.out.println("six");
        } else if (a == 7) {
            System.out.println("seven");
        } else if (a == 8) {
            System.out.println("eight");
        } else if (a == 9) {
            System.out.println("nice");
        } else if (a == 10) {
            System.out.println("ten");
        } else {
            System.out.println("Vui lòng nhập lại!");
        }
    }
}
