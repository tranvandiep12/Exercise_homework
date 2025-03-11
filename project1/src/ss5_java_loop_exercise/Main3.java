package ss5_java_loop_exercise;

public class Main3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
//        i = 1 ==> hàng ngang
//        j = 2 ==> hàng dọc
            for(int j = 1 ; j <= n; j++){
                if( i == n || j == 1|| j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
