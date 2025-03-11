package ss4_condision_exercise;

import java.util.Scanner;

/**
 * Kiểm tra và tìm ngày kế, tiếp ngày trước đó
 */
public class Date_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào ngày: ");
        int day = scanner.nextInt();

        System.out.print("Hãy nhập vào Tháng: ");
        int month = scanner.nextInt();

        System.out.print("Hãy nhập vào tháng: ");
        int year = scanner.nextInt();

        if(day < 1 && day > 12){
            System.out.println("Ngày không hợp lệ vui lòng nhập lại!");
        }

        if(month < 1 && day > 12){
            System.out.println("Tháng không hợp lệ vui lòng nhập lại!");
        }
    }
}
