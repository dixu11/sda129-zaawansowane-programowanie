package advanced.inheritance;

public class WildBoar extends Animal {

    @Override
    public void makeSound() {
        System.out.println("chrum chrum");
    }

    @Override
    public void eat() {
        System.out.println("dzie moje pyszne zołędzie");
    }
}
