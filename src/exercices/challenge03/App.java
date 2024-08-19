package exercices.challenge03;

import java.util.Arrays;
import java.util.List;

public class App {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void isPositive() {
        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println("Are all numbers positive? : " + todosPositivos);
    }

    public static void main(String[] args) {
        App app = new App();

        app.isPositive();
    }
}
