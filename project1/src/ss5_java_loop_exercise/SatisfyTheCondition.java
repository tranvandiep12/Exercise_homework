package ss5_java_loop_exercise;


/**
 * Tím các số thoả mãn điều kiện
 */
public class SatisfyTheCondition {
    public static void main(String[] args) {
        System.out.println("Các số thoả mãn điều kiện: ");
        for (int i = 10; i <= 99; i++) {
            int tenDigit = i / 10;
            int onesDigit = i % 10;

            int sum = tenDigit + onesDigit;
            int product = tenDigit * onesDigit;


            if (product == 2 * sum) {
                System.out.println(i);
            }
        }
    }
}
