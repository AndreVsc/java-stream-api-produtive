package exercices.challenge07;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void encontrarSegundoMaior() {
        Optional<Integer> segundoMaior = numeros.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número é: " + segundoMaior.get());
        } else {
            System.out.println("Não há um segundo maior número.");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        
        app.encontrarSegundoMaior();
    }
}
