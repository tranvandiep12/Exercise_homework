package ss3_java_overview_exercise;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Hãy Nhập Vào Bán Kính Hình Tròn:   ");
        double r = scanner.nextDouble();
        double cv = 2 * pi * r;
        double dt = pi * Math.pow(r, 2);
        System.out.println("Chu vi hình tròn là:  " + cv);
        System.out.println("Diện tích hình tròn là:  " + dt);
    }
}
