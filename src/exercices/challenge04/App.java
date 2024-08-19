package exercices.challenge04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void removeImpares() {

        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println("Lista após remover os ímpares: " + numerosPares);
    }

    public static void main(String[] args) {
        App app = new App();

        app.removeImpares();
    }
}
