package ss3_java_overview_exercise;

import java.util.Scanner;

public class CashAndVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy Nhập Vào Tên Sản Phẩm:  ");
        String productName = scanner.nextLine();
        System.out.print("Hãy Nhập Vào Số Lượng Sản Phẩm:  ");
        int quantityProduct = scanner.nextInt();
        System.out.print("Hãy Nhập Vào Giá Của Sản Phẩm:  ");
        double unitPriceProduct = scanner.nextDouble();
        double money = quantityProduct * unitPriceProduct;
        double vat = money * 0.1;
        System.out.println("Giá Của Sản Phẩm Trên Là:  " + money);
        System.out.println("Thuế: " + vat);
    }
}
