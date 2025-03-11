package ss4_condision_exercise;

import java.util.Scanner;

public class ValueInversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào a:  ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào b:  ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(" Giá trị sau khi đổi của a :  " + a);
        System.out.println(" Giá trị sau khi đổi của b :  " + b);

    }
/**
 * Cách 2 :
 * vi dụ a = 3 , b = 4;
 * a = a + b; --> 7;
 * b = a - b;  7 - 4 = 3;
 * a = a - b; 7 - 3 = 4;
 */
}
