package ss6_java_method_exercise;

import java.util.Scanner;

public class Ptb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào soA: ");
        int a = scanner.nextInt();
        System.out.print("Hãy nhập vào soB: ");
        int b = scanner.nextInt();
        System.out.print("Hãy nhâp vào soC: ");
        int c = scanner.nextInt();
        double delta;
        int x1;
        int x2;

//        ptb1(a, b);
        ptb2(a, b, c);
    }

    public static void ptb1(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / (double) a;
            System.out.println("Nghiệm x là:  " + x);
        }
    }

    public static void ptb2(int a, int b, int c) {
        if (a == 0) {
            // bx + c
            if (b == 0) {
                // c = 0
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
//                    c != 0
                    System.out.println("Phương trình vô nghiệm ");
                }
//                double x = -c / b;
//                System.out.println("Nghiệm là: " + x);
            }else {
                double x = -c / b;
                System.out.println("Nghiệm là: " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiêm kép x1 = x2 = " + -b / 2 * a);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có nghiệm là: " + x1);
                System.out.println("Phương trình có nghiệm là: " + x2);
            }
        }
    }
}
