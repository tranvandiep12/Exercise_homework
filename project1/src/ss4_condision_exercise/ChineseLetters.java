package ss4_condision_exercise;


import java.util.Scanner;

/**
 * Đổi chữ hoa thành chữ thường và ngược lại
 */
public class ChineseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập vào kí tự:  ");
        char charcater = scanner.nextLine().charAt(0);

        if ((charcater >= 'A' && charcater <= 'Z') || (charcater >= 'a' && charcater <= 'z')) {
            if (charcater >= 'a' && charcater <= 'z') {
                charcater -= 32;
            } else {
                charcater += 32;
            }
            System.out.println("Ký tự chuyển đổi: " + charcater);
        } else {
            System.out.println("Kí tự bạn nhập sai. Vui lòng nhập lại !");
        }
    }

}

