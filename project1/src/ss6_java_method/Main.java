package ss6_java_method;

public class Main {
    public static void main(String[] args) {
        hello("A");
        hello("B");
        hello("C");
    }
    public  static  void hello(String name){
        System.out.printf("Hello %s\n",name);
    }
}
