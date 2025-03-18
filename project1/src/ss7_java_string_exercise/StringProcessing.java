package ss7_java_string_exercise;

import java.util.Scanner;

/**
 * Xử lí chuỗi trong java
 */
public class StringProcessing {
    public static void main(String[] args) {

        String str = "Hello Word";

        System.out.println("a. Lấy ra chữ word: " + str.substring(6));
        System.out.println("b. Thay o thành f: " + str.replace('o', 'f'));

        int count = 0;
        for(int i = 0; i <= str.length()-1;i++){
            if(str.charAt(i) == 'l'){
                count++;
            }
        }
        System.out.println("c. Số kí tự l là: " + count);

        System.out.println("d.Vị trí xuất hiện đầu tiên: " + str.indexOf('l'));
        System.out.println("Vị trí xuất hiện cuối cùng: " + str.lastIndexOf('l'));

        System.out.println("f. Xoá khoảng trống đầu tiên và cuối cùng: " + str.trim());

        System.out.println("i.Đổi toàn bộ kí tự sang chữ hoa: " + str.toUpperCase());
        System.out.println("i.Đổi toàn bộ kí tự sang chữ thường: " + str.toLowerCase());
    }
}
