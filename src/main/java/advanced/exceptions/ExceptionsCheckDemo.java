package advanced.exceptions;

public class ExceptionsCheckDemo {

    public static void main(String[] args) {
        try{
            method1();
        }catch (MyCheckException e){
            System.out.println(e.getMessage());
        }
        System.out.println("test");
    }

    private static void method1()throws MyCheckException {
        method2();
        System.out.println("m1");
    }

    private static void method2() throws MyCheckException{
        method3(-10);
        System.out.println("m2");
    }

    private static void method3(int a) throws MyCheckException {
        if (a < 0) { //czy na minusie?
            throw new MyCheckException("coś się sypie");
        }
        System.out.println("m3");
    }
}

