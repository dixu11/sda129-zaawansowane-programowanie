package advanced.inheritance;

public  class AnimalsDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 1, false);
        //dog = new Cat(); // działałoby gdyby referencja dog była typu Animal lub Object
        Dog dog2 = new Dog();

        dog.bark();
        dog.sit();
        dog.eat();

        Cat cat = new Cat("Kicia Mała", 4, 6);
        Cat cat2 = new Cat();

        cat.meowing();
        cat.climbDoor();
        cat.eat();

        AnimalKeeper animalKeeper = new AnimalKeeper();
//        animalKeeper.feedDog(dog);
//        animalKeeper.feedCat(cat);
        animalKeeper.feedAnimal(dog);
        animalKeeper.feedAnimal(cat);
    }
}


//dziedzienie, cel: ograniczenie powtórek + polimorfizm
//co dziedziczymy? pola, metody, typ
//klasa abstrakcyjna:
//-nie można stworzyć instancji
//-może mieć abstrakcyjne metody

//abstrakcyjna metoda
//nie ma ciała
//trzeba ją nadpisywać

//konkret                           abstrakcja
//klasa        abstr klasa         interfejs

//polimorfizm - zdolność języka obiektowego aby wstawiać obiekty różnych typów do wspólnej referencji
//              a zachowania referencji dostosują się do aktualnego typu obiektu

//polimorfizm otwiera drogę do wzorców projektowych oraz umożliwia realizowanie zasady O/C solid
// dzięki której tempo dodawania nowych funkcjonalności może być stałe bez względu jak wielka jest aplikacje
