package ss5_java_loop_exercise;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            //Ưng với mỗi bước lặp cuả cha ==> Toàn bộ bước lăp của con
//            i = 1 ====> 5 lần hello
//            i = 2 ====> 5 lần hello
//            i = 3 ====> 5 lần hello
//            i = 4 ====> 5 lần hello
//            i = 5 ====> 5 lần hello
            for(int j = 1 ; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
