package ss6_java_method_exercise;

import java.util.Scanner;

/**
 * Phương trình bậc 1
 */
public class Ptb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào soA: ");
        double a = scanner.nextInt();
        System.out.print("Hãy nhập vào soB: ");
        double b = scanner.nextInt();
        ptb1(a,b);
    }
    public static  void ptb1(double a , double b){
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }

        } else {
            double x = -b/a;
            System.out.println("Nghiệm pt là: " + x);
        }
    }
}
