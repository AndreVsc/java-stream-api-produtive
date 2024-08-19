package exercices.challenge02;

import java.util.Arrays;
import java.util.List;

public class App {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void sumEvenNumber() {
        int somaNumerosPares = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println("the sum of even numbers: " + somaNumerosPares);
    }

    public static void main(String[] args) {
        App app = new App();
        
        app.sumEvenNumber();
    }
}
