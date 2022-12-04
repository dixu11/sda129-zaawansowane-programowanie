package advanced.generyczne;

public class BoxDemo {
    public static void main(String[] args) {

        String text = "abc";
        Box<String> box1 = new Box<>(text);
        String content =  box1.getData();
        System.out.println(content);


        int liczba = 123;
        //Integer liczba2 = liczba;
        Box<Integer> box2 = new Box<>(liczba);
        int liczba3 =  box2.getData();
        System.out.println(liczba3);
    }
}
