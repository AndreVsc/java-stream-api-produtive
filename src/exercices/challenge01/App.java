package exercices.challenge01;

import java.util.Arrays;
import java.util.List;

public class App {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void orderNumbers() {
        numeros.stream().sorted().forEach(System.out::println);
    }

    public static void main(String[] args) {
        App app = new App();

        app.orderNumbers();
    }
}
