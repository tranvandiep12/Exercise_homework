package ss4_condision_exercise;

import java.util.Scanner;

public class EnglishNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào bàn phím:  ");
        int Number = scanner.nextInt();

        switch (Number) {
            case 1 -> System.out.println(" one ");
            case 2 -> System.out.println(" two ");
            case 3 -> System.out.println(" tree ");
            case 4 -> System.out.println(" four ");
            case 5 -> System.out.println(" five ");
            case 6 -> System.out.println(" six ");
            case 7 -> System.out.println(" seven ");
            case 8 -> System.out.println(" eight ");
            case 9 -> System.out.println(" nice ");
            case 10 -> System.out.println(" ten ");
            default -> System.out.println(" Nhâp sai giá trị! ");
        }
    }
}
