package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class AgeCaculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào năm sinh của bạn:  ");
        int namsinh = Integer.parseInt(scanner.nextLine());
        int yearold = Year.now().getValue() - namsinh;
        System.out.println("Tuổi của bạn là:  " + yearold);
//        How to ...... in java
    }
}
