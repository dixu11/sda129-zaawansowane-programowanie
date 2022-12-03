package advanced.inheritance;

public class Cat extends Animal{

    private String name;
    private int age;
    private int lives;

    public Cat(String name, int age, int lives) {
        this.name = name;
        this.age = age;
        this.lives = lives;
    }

    public Cat() {
        name = "Filemon";
        age = 1;
        lives = 9;
    }

    public void meowing(){
        System.out.println("Miau, miauuuuu");
    }

    @Override
    public void makeSound() {
        meowing();
    }

    public void climbDoor() {
        System.out.println("<kot się wdrapuje i siedzi zadowolony>");
    }

    public void eat() {
        super.eat();
        System.out.println("... his pray");
    }



}
