package Mission3;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static Mission3.ExceptionCatching.catchMe;

public class Main {
    public static void main(String[] args) throws URISyntaxException, ArithmeticException {
        try {
            ExceptionCatching.catchMe();
        } catch (NullPointerException e) {
            System.out.println("Поймали исключение NullPointerException");
        } catch (FileNotFoundException e) {
            System.out.println("Поймали исключение FileNotFoundException ");
        }


    }


}
