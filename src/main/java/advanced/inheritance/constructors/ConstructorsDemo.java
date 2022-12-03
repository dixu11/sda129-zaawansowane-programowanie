package advanced.inheritance.constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B();
    }
}

class A{ //klasy pakietowe

    public A() {
        System.out.println("A...");
    }
    public A(int num) {
        System.out.print("A");
        System.out.println(num);
    }
}
class B extends A{

 //   int age=3;
    public B() {
        //super(age);
        super(5);
        System.out.println("B");
    }
}