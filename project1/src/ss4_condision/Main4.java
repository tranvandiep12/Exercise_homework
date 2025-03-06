package ss4_condision;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào bàn phím:   ");
        int n = scanner.nextInt();
        for(int i = 1 ; i <= n ; i += 2){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}
