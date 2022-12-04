package advanced.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", 20);
        Person person2 = new Person("Ala", 60);
        Person person3 = new Person("Tomek", 33);
        Person person4 = new Person("Ada", 44);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);


        MyIntegerComparator c = new MyIntegerComparator();
        Set<Integer> numbers = new TreeSet<>(c);
        numbers.add(23);
        numbers.add(44);
        numbers.add(1);
        numbers.add(77);
        System.out.println(numbers);

        Set<Person> people = new TreeSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(people);
    }
}

class MyIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        if (num1 < num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}
