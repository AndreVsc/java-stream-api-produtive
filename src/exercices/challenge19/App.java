package exercices.challenge19;

import java.util.Arrays;
import java.util.List;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void somarDivisiveis() {

        int soma = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(Integer::intValue).sum();

        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + soma);
    }

    public static void main(String[] args) {
        App app = new App();
        app.somarDivisiveis();
    }
}
