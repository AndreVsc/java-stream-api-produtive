package exercices.challenge08;

import java.util.List;
import java.util.Arrays;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void calculedAllNumbers() {
        int somaDosDigitos = numeros.stream().flatMapToInt(num -> Integer.toString(num).chars().map(c -> c - '0')).sum();
        System.out.println("A soma dos dígitos de todos os números é: " + somaDosDigitos);
    }

    public static void main(String[] args) {
        App app = new App();
        
        app.calculedAllNumbers();
    }
}
