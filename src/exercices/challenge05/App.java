package exercices.challenge05;

import java.util.Arrays;
import java.util.List;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void averageCalculate() {
        double media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("The avarage is : " + media);
    }

    public static void main(String[] args) {
        App app = new App();
        app.averageCalculate();
    }
}
