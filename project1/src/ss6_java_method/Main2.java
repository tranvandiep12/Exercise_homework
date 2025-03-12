package ss6_java_method;

public class Main2 {
    public static void main(String[] args) {
        // Tính tổng 2 số a và b xem cách nào tối ưu nhất
        int a = 5;
        int b = 6;


        calTotal(a, b);

        int tong = calTotal2(a,b);

        System.out.println("Tổng cách 2: " + tong);
    }
    // Cách 1
    public static void calTotal(int a, int b) {
        int total = a + b;
        System.out.println("Tổng là: " + total);
    }
    // Cách 2 : tối ưu hơn , linh hoạt hơn
    public static int calTotal2(int a, int b) {
        int total = a + b;
        return total;
    }
}
