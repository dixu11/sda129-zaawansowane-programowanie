package basics.people;

import basics.people.car.Car;
import basics.people.line.Line;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes-Benz", 150000, 20000);
        mercedes.distanceFromStart(5000);
        mercedes.carInfo();
        mercedes.nextService();

        Line line1 = new Line(3, "@");
        Line line2 = new Line(4, "x");
        Line line3 = new Line(5, "!");

        line1.printLine();
        line2.printLine();
        line3.printLine();

    }
}
