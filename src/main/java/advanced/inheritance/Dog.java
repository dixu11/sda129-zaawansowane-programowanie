package advanced.inheritance;

public class Dog extends Animal {
    private String name;
    private int age;
    private boolean good;

    public Dog(String name, int age, boolean good) {
        this.name = name;
        this.age = age;
        this.good = good;
    }

    public Dog() {
        name = "Burek";
        age = 6;
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
