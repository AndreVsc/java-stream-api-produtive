package exercices.challenge15;

import java.util.Arrays;
import java.util.List;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, -6, 7, 8, 9, 10);

    void verificarNumeroNegativo() {
        boolean temNegativo = numeros.stream().anyMatch(n -> n < 0);

        // Exibe o resultado no console
        if (temNegativo) {
            System.out.println("A lista contém pelo menos um número negativo.");
        } else {
            System.out.println("A lista não contém números negativos.");
        }
    }

    public static void main(String[] args) {
        App app = new App();

        app.verificarNumeroNegativo();
    }
}
