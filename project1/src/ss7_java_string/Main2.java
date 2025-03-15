package ss7_java_string;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // B1 Nhập vào số lượng phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập vào số lượng phần tử mảng: ");
            n = scanner.nextInt();

            if(n < 0){
                System.out.println("Số lượng phần tử phải >= 0 ! Vui lòng nhập lai.");
            }
        } while (n < 0);
        // Tạo ra mảng có n phần tủ
        int[] arr = new int[n];

        // B3: Nhập mảng
        for(int i = 0; i < n; i++){ // i ---> 0 1 2 3 4
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt(); // 1 2 3 4 5

        }
        // B4: xuất mảng
        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
