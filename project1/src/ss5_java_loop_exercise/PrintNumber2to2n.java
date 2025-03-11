package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * In dãy số chẵn từ 2 đến 2n
 */
public class PrintNumber2to2n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập n từ bàn phím:   ");
        int n = scanner.nextInt();

        for(int i = 2; i <= n * 2; i+=2){
            System.out.print(i + " ");
        }
    }
}
