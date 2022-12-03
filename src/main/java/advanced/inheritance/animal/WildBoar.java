package advanced.inheritance.animal;

public class WildBoar extends Animal {


    public WildBoar(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("chrum chrum");
    }

    @Override
    public void eat() {
        System.out.println("dzie moje pyszne zołędzie");
    }
}
