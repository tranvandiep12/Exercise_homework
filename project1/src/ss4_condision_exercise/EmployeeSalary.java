package ss4_condision_exercise;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhập thâm niên công tác: ");
        int tnct = scanner.nextInt();

        double basicSalary = 650000;

        double salaryCoefficient;
        if(tnct < 12){
            salaryCoefficient = 1.92;
        } else if (tnct < 36 ){
            salaryCoefficient = 2.34;
        } else if (tnct < 60){
            salaryCoefficient = 3.0;
        } else {
            salaryCoefficient = 4.5;
        }

        double salary =  salaryCoefficient * basicSalary;

        System.out.println("Lương của nhân viên:  " + salary);
    }
}
