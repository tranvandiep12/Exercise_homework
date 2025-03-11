package ss4_condision_exercise;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print(" Nhập tháng:  ");
//        int month = scanner.nextInt();
//        if( month <= 0 || month > 12){
//            System.out.println("Thang nhap vao khong hop le, vui long nhap lai!!");
//        }
        int month;
        boolean isValidMonth;
        do {
            System.out.print("NHập tháng [1-12]:  ");
             month = scanner.nextInt();
            isValidMonth =month < 0 || month > 12;
             if(isValidMonth){
                 System.out.println("Gia tri ban nhap khong hop le vui long nhap lai!!");
             }
        } while (isValidMonth);



        System.out.print(" Nhập năm:  ");
        int year = scanner.nextInt();

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày ");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng " + month + " có 29 ngày ");
                } else {
                    System.out.println("Tháng " + month + " có 28 ngày ");
                }
                break;
            default:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
        }
    }
}
