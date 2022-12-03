package advanced.inheritance.constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B();
    }
}

class A{ //klasy pakietowe
    public A(int num) {
        System.out.println("A");
        System.out.println(num);
    }
}
class B extends A{
    public B() {
        super(5);
        System.out.println("B");
    }
}