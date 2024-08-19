package exercices.challenge12;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void produtoDosNumeros() {

        OptionalInt produto = numeros.stream().mapToInt(Integer::intValue).reduce((a, b) -> a * b);

        if (produto.isPresent()) {
            System.out.println("O produto de todos os números é: " + produto.getAsInt());
        } else {
            System.out.println("A lista está vazia, não há produto.");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        
        app.produtoDosNumeros();
    }
}
