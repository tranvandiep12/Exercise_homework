package ss5_java_loop_exercise;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào đây:   ");
        int n = scanner.nextInt();
         int distance = 1;
         int cout = 0;
        /**
         *  i = 2; 0 = 1; ---> 2;  cout == 1; distance = 1;
         *  i = 3; 1 = 1; -----> -3; cout == 0;  distance = 2;
         *  i = 4; 0 = 2;-------> 4; cout == 1; distance = 2;
         *  i = 5 ; 1 = 2;------> 5; cout == 2; distance = 2;
         *  i = 6; 2 = 2; -----> -6; cout == 0; distance = 3;
         */
         for(int i = 2 ; i <= n ; i++){
             if(cout == distance){
                 System.out.print(-i + "\t");
                 cout = 0;
                 distance++;
             } else {
                 System.out.print(i + "\t");
                 cout++;
             }
         }
    }
}
