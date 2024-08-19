package exercices.challenge09;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void isDifferent() {
        Set<Integer> numerosUnicos = new HashSet<>(numeros);
        
        boolean todosDistintos = numerosUnicos.size() == numeros.size();
        
        System.out.println("All numbers is distincts? : " + todosDistintos);
    }

    public static void main(String[] args) {
        App app = new App();

        app.isDifferent();
    }
}
