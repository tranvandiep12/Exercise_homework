package ss4_condision_exercise;

import java.util.Scanner;

public class Ptbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào a:  ");
        double a = scanner.nextDouble();

        System.out.print("Nhập vào b:  ");
        double b = scanner.nextDouble();

        double x;

        if (a == 0) {
            if (b == 0) {
                System.out.println(" Phương trình có vô số nghiệm ");
            } else {
                System.out.println(" Phương trình vô nghiệm ");
            }
        } else {
            x = -b / a;
            System.out.println("Phương trình có nghiệm: " + x);
        }
    }
}
