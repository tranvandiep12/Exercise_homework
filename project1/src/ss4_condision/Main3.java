package ss4_condision;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím:   ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n ; i++){
            System.out.print(i + " ");
        }
    }
}
