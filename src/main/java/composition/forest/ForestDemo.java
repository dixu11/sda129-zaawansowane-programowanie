package composition.forest;

public class ForestDemo {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree2 = new Tree();
        Tree tree3 = new Tree();

        System.out.println(tree);
        System.out.println(tree2);
        System.out.println(tree3);

        tree.movesOneYearForward();
        tree.movesOneYearForward();
        tree2.movesOneYearForward();

        System.out.println(tree);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
