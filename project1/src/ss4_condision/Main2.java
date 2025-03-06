package ss4_condision;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhâp vào a:  ");
//        int nhap = scanner.nextInt();
//        switch (nhap){
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("tree");
//                break;
//            case 4:
//                System.out.println("four");
//                break;
//            case 5:
//                System.out.println("five");
//                break;
//            case 6:
//                System.out.println("six");
//                break;
//            case 7:
//                System.out.println("seven");
//                break;
//            case 8:
//                System.out.println("eight");
//                break;
//            case 9:
//                System.out.println("nice");
//                break;
//            case 10:
//                System.out.println("ten");
//                break;
//            default:
//                System.out.println("Nhập sai giá trị.");
//        }
//        switch (nhap){
//            case 1 -> System.out.println("one");
//            case 2 -> System.out.println("two");
//            case 3 -> System.out.println("tree");
//            case 4 -> System.out.println("four");
//            default -> System.out.println("Nhâp sai giá trị"5);
//        }
        int a = 4, b = 4;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        int min2 = Math.min(a, b);
        System.out.println(max);
        System.out.println(min);
        System.out.println(min2);

    }
}
