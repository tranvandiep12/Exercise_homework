package ss6_java_method_exercise;

import java.util.Scanner;

/**
 * Phương trình bậc 2 Method
 */
public class Ptb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();


        Ptb2(a, b, c);
    }

    public static void Ptb2(double a, double b, double c) {

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double root = -c / b;
                System.out.println("Đây là phương trình bậc nhất có nghiệm: " + root);
            }
        }


        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("Nghiệm 1: " + root1);
            System.out.println("Nghiệm 2: " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Phương trình có 1 nghiệm kép: ");
            System.out.println("Nghiệm: " + root);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}