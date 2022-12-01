package basics.people.line;

public class Line {

    private final int lengthOfLine
            ;

    private final String filling;

    public Line(int length, String filling) {
        this.lengthOfLine = length;
        this.filling = filling;
    }

    public void printLine(){
        for (int i = 0; i < lengthOfLine; i++) {
            System.out.print(filling);
        }
        System.out.print("\n");

        }

    }

