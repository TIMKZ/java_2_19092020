package HW2_2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private int number;

    public MyArraySizeException() {

    }

    public int getNumber() {
        return number;
    }

    public MyArraySizeException(String s, int number) {
        super(s);
        this.number = number;
    }
}
