package ss4_condision_exercise;

import java.util.Scanner;

public class Ptbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào a:  ");
        double a = scanner.nextDouble();

        System.out.print("Nhập vào b:  ");
        double b = scanner.nextDouble();

        System.out.print("Nhập vào c:  ");
        double c = scanner.nextDouble();

        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println(" Phương trình có vô số nghiệm");
                } else {
                    System.out.println(" Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println(" Phương trình có nghiệm: "+x);
            }
        } else {
            double delta = Math.pow(b,2) - 4 * a * c;

            if(delta < 0){
                System.out.println(" Phương trình vô nghiệm ");
            } else if( delta == 0){
                double x = -b / (2*a);
                System.out.println(" Phương trình có nghiêm kép x1 = x2 = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2*a);
                double x2 = (-b + Math.sqrt(delta)) / (2*a);
                System.out.println("Nghiệm của phương trình là:  " + x1);
                System.out.println("Nghiệm của phương trình là:  " + x2);
            }
        }
    }
}
