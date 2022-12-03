package advanced.inheritance;

import advanced.inheritance.animal.Animal;

public class AnimalKeeper {

/*    public void feedDog(Dog dog) {
        System.out.println("Hello dog, this is your cat for dinner");
        dog.eat();
        dog.bark();
    }

    public void feedCat(Cat cat) {
        System.out.println("Hello cat, this is your mouse for dinner");
        cat.eat();
        cat.meowing();
    }*/

    public void feedAnimal(Animal animal) {
        System.out.println("Feeding animal " );
        animal.eat();
        animal.makeSound(); // polimorfizm

    /*    if (animal instanceof Dog) {  // brak polimorfizmu
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meowing();
        }*/

//        animal.bark();
        //jesli jest psem to szczeka a jeśli kotem to miałczy
    }


}
