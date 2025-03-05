package ss3_java_overview_exercise;

public class Value_A_I_J {
    public static void main(String[] args) {
        int i = 1, j = 1;
//        int a = i++ + j++;
//           a =  1 + 1 = 2
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(a);
//        int a = i++ + ++j;
//           a = 1 + 2;
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(a);
//        int a = ++i + j++;
//        a = 2 +  1;
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(a);
//    int a = ++i + ++j;
//    a = 2 + 2 ;
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(a);
//        int a = i++ + j++ + i++ + j++;
//        i = 3; j = 3;
//        a = 1 + 1 + 2 + 2
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(a);
//        int a = ++i + ++j + i++ + j++;
//        a = 2 + 2 + 2 + 2;
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(a);
//        int a = i++ + ++i - i-- - --i;
//        a = 1 + 3 - 3 - 1
//
        int a = 1;
        a += a++ + ++a;
        System.out.println(a);
    }
}
