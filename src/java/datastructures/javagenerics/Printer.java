package java.datastructures.javagenerics;

public class Printer {

    public static <T> void printArray(T[] array ) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
