package ss5_java_loop_exercise;

public class Main5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n ; i++){
            // i = 1 ==> n
            // i = 2 ==> (n - 1) *
            // i = 3 ==> (n - 2) *
            // i = 4 ==> (n - 3) *
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
