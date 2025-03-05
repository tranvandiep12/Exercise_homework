package ss3_java_overview;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tuổi:   ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào tên:  ");
        String name = scanner.nextLine();
        System.out.println("Tuổi của bạn là:  " + tuoi);
        System.out.println("Tên của bạn là:  " + name);

    }
}
