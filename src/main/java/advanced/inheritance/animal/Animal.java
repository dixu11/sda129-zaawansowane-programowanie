package advanced.inheritance.animal;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal prepares to eat...");
    }

    public abstract void makeSound();




}
