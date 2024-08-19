package exercices.challenge18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    void verificarTodosIguais() {

        boolean todosIguais = numeros.stream().collect(Collectors.toSet()).size() == 1;

        if (todosIguais) {
            System.out.println("Todos os números da lista são iguais.");
        } else {
            System.out.println("Nem todos os números da lista são iguais.");
        }
    }

    public static void main(String[] args) {
        App app = new App();

        app.verificarTodosIguais();
    }
}
