package ss3_java_overview_exercise;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn hãy nhập vào điểm của môn toán:  ");
        double Math = scanner.nextDouble();
        System.out.print("Hệ số của môn toán:  ");
        double hsMath = scanner.nextDouble();
        System.out.print("Bạn hãy nhập vào điểm của môn lý:  ");
        double Physics = scanner.nextDouble();
        System.out.print("Hệ số của môn vật lí:  ");
        double hsPhysics = scanner.nextDouble();
        System.out.print("Bạn hãy nhập vào điểm của môn hoá:  ");
        double Chemistry = scanner.nextDouble();
        System.out.print("Hệ số của môn hoá:  ");
        double hsChemistry = scanner.nextDouble();
        double diemTb = (Math * hsMath + Physics * hsPhysics + Chemistry * hsChemistry) / (hsMath + hsPhysics + hsChemistry);
        System.out.println("Điểm trung bình của bạn là:  " + diemTb);
    }
}
