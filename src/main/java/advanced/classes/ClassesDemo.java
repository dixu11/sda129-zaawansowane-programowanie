package advanced.classes;

public class ClassesDemo {
    public static void main(String[] args) {
        PackageClass packageClass = new PackageClass();
        InnerClass innerClass = new InnerClass();
        class LocalClass{
            private int a;
            public void hello(){}
        }
        LocalClass localClass = new LocalClass();
        Car truck = new Car(){
            @Override
            void drive() {
                System.out.println("Prowadzę ciężarówkę");
            }
        };
        truck.drive();



    }

   static class InnerClass { //klasa wewnętrzna domyślnie jest zależna od obiektu klasy zewnętrznej
    } //jeśli chcemy używać jej niezależnie to powinna być statyczna

}

class PackageClass {

}

class Car{
    void drive() {
        System.out.println("Prowadzę samochód");
    }
}
