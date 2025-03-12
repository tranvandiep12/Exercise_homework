package ss6_java_method_exercise;

import java.util.Scanner;

/**
 * Chuyển kí tự hoa sang kí tự thường
 */
public class toLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào kí tự: ");
        char ch = scanner.nextLine().charAt(0);
        System.out.println(toLowerCase(ch));

    }
    public static char toLowerCase(char c){
        if(c >= 'A' && c <= 'Z'){
            c += 32;
        }
        return c;

    }
}
