package advanced.exceptions;

public class MyException extends RuntimeException {
    private int wrongNumber;

    public MyException(int wrongNumber) {
        this.wrongNumber = wrongNumber;
    }

    public int getWrongNumber() {
        return wrongNumber;
    }
}
