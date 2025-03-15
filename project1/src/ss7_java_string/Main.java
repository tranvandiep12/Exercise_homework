package ss7_java_string;

public class Main {
    public static void main(String[] args) {
        String name1= "Nguyễn Văn A"; // Trong sping pool
        String name2 = "Nguyễn Văn A";
        String name3 = new String("Nguyễn Văn A"); // Ngoài string pool --> false
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name2));

    }
}
