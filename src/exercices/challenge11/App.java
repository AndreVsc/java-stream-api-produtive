package exercices.challenge11;

import java.util.Arrays;
import java.util.List;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void somaQuadrados() {

        int somaQuadrados = numeros.stream().mapToInt(n -> n * n).sum();

        System.out.println("A soma dos quadrados de todos os números é: " + somaQuadrados);
    }

    public static void main(String[] args) {
        App app = new App();
        
        app.somaQuadrados();
    }
}
