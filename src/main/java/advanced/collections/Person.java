package advanced.collections;

public class Person implements Comparable<Person>{
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        if (age < other.age) {
            return -1;
        } else if (age == other.age) {
            return 0;
        }else {
            return 1;
        }
    }
}
