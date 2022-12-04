package advanced.exceptions;

public class ExceptionsDemo2 {

    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
        method2();
        System.out.println("m1");
    }
    private static void method2() {
        method3(10);
        System.out.println("m2");
    }
    private static void method3(int a) {
        if (a < 0) {
            return;
        }
        System.out.println("m3");
    }
}
