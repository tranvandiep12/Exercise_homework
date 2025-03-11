package ss5_java_loop_exercise;

public class Main2 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
//        i = 1 ==> hàng 1
//        i = 2 ==> hàng 2
            for(int j = 1 ; j <= n; j++){
                if( i == 1 || i == n || j == 1|| j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
