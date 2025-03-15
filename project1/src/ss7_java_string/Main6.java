package ss7_java_string;

import java.util.Scanner;

public class Main6 {
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
        if (n > 0) {
            System.out.println("\nPhần tử cuối cùng trong mảng là: " + arr[n - 1]);
        }

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


}

