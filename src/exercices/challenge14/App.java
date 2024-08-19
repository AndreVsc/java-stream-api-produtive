package exercices.challenge14;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17, 19, 23);

    private boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    void encontrarMaiorPrimo() {
        OptionalInt maiorPrimo = numeros.stream().filter(this::isPrimo).mapToInt(Integer::intValue).max();

        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo.getAsInt());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    public static void main(String[] args) {
        App app = new App();

        app.encontrarMaiorPrimo();
    }
}
