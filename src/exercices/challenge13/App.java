package exercices.challenge13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void filtrarIntervalo() {
        
        int limiteInferior = 5;
        int limiteSuperior = 10;

        List<Integer> numerosNoIntervalo = numeros.stream().filter(n -> n >= limiteInferior && n <= limiteSuperior).collect(Collectors.toList());
        
        System.out.println("Números no intervalo entre " + limiteInferior + " e " + limiteSuperior + ": " + numerosNoIntervalo);
    }

    public static void main(String[] args) {
        App app = new App();

        app.filtrarIntervalo();
    }
}
