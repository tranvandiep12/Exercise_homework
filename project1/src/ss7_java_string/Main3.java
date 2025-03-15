package ss7_java_string;

public class Main3 {
    public static void main(String[] args) {
         int[] a = {10,20,30};
         Mang(a);

         for(int i = 0; i < a.length; i++){
             System.out.print(a[i] + "\t");
         }
    }
    public  static  void Mang(int[] arr){
        arr[1] = 99;
        arr = new int[]{9,4,5};
        arr[1] = 100;
    }
}
