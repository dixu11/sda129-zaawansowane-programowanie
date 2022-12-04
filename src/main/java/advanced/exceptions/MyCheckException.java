package advanced.exceptions;

public class MyCheckException extends Exception {

    private String message;

    public MyCheckException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
