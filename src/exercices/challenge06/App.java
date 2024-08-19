package exercices.challenge06;

import java.util.Arrays;
import java.util.List;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void verificarMaiorQueDez() {
        // Verifica se há algum número maior que 10 na lista
        boolean response = numeros.stream().anyMatch(n -> n > 10);
        System.out.println("The list has a number 10? " + response);
    }

    public static void main(String[] args) {
        App app = new App();

        app.verificarMaiorQueDez();
    }
}
