package basics;


public class MainCheckException {
    public static void main(String[] args) {
        canThrowAnException();
    }

    static void canThrowAnException() {

        throw new IllegalStateException();
    }
}
