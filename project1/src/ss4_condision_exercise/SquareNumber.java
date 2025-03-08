package ss4_condision_exercise;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào bàn phím:  ");
        int n = scanner.nextInt();
        double squareNumber = Math.sqrt(n);

        if(squareNumber % 1 == 0){
            System.out.println(n + " đây là số chính phuương");
        } else {
            System.out.println(n + " không phải là số chính phuương");
        }

    }
}
