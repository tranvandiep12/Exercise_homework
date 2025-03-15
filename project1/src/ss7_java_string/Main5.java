package ss7_java_string;

import java.util.Scanner;

public class Main5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        do {
            System.out.print("Nhập vào số lượng phần tử mảng: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Số lượng phần tử phải >= 0 ! Vui lòng nhập lai.");
            }
        } while (n < 0);

        int[] arr = new int[n];
        inputarr(arr);
        outputarr(arr);
        boolean isEven = checkeven(arr);
        if (isEven) {
            System.out.println("trong mảng là số chẵn");
        } else {
            System.out.println("trong mảng có số lẻ");
        }

        totalceven(arr);
//        FinalX(arr);

    }

    public static void inputarr(int[] arr) {

        for (int i = 0; i < arr.length; i++) { // i ---> 0 1 2 3 4
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt(); // 1 2 3 4 5

        }
    }

    public static void outputarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static boolean checkeven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void totalceven(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                total += arr[i];
            }
        }
        System.out.println("Tổng các số lẻ là: " + total);
    }

//    public static void FinalX(int[] arr) {
//       int x = arr.length;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("S cuối cùng trong mảng: " + x);
//        }
//    }
}


