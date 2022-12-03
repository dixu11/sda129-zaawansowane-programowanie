package advanced.inheritance.animal;

public class Dog extends Animal {
    private boolean good;

    public Dog(String name, int age, boolean good) {
        super(name,age);
        this.good = good;
    }

    public Dog() {
        super("Burek",6);
        good = true;
    }

    public void bark() {
        System.out.println("Hau! Hau!");
    }

    public void sit() {
        System.out.println("<siada i macha ogonem>");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating cat");
    }

    @Override
    public void makeSound() {
        bark();
    }
}
