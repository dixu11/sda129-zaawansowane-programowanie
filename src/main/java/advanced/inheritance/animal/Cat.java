package advanced.inheritance.animal;

public class Cat extends Animal{


    private int lives;

    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = lives;
    }

    public Cat() {
        super("Filemon",1);
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
