package basics.lines;

public class Line {
   private int length;
   private char fill;

    public Line(int length, char fill) {
        this.length = length;
        this.fill = fill;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(fill);
        }
        System.out.println();


//        String fillString = fill + "";
//        System.out.println(fillString.repeat(length));
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                ", fill=" + fill +
                '}';
    }
}
