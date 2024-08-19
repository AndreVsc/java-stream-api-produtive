package exercices.challenge20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30, -5);

    // Desafio 1: Mostrar a lista na ordem numérica
    void mostrarListaOrdenada() {
        List<Integer> listaOrdenada = numeros.stream().sorted().collect(Collectors.toList());
        System.out.println("Lista ordenada: " + listaOrdenada);
    }

    // Desafio 2: Imprimir a soma dos números pares
    void somaPares() {
        int soma = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos números pares: " + soma);
    }

    // Desafio 3: Verificar se todos os números são positivos
    void todosPositivos() {
        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println("Todos os números são positivos: " + todosPositivos);
    }

    // Desafio 4: Remover todos os valores ímpares
    void removerImpares() {
        List<Integer> listaSemImpares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Lista sem valores ímpares: " + listaSemImpares);
    }

    // Desafio 5: Calcular a média dos números maiores que 5
    void mediaMaioresQue5() {
        double media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Média dos números maiores que 5: " + media);
    }

    // Desafio 6: Verificar se há algum número maior que 10
    void algumMaiorQue10() {
        boolean existeMaiorQue10 = numeros.stream().anyMatch(n -> n > 10);
        System.out.println("Há algum número maior que 10: " + existeMaiorQue10);
    }

    // Desafio 7: Encontrar o segundo número maior da lista
    void segundoMaior() {
        Optional<Integer> segundoMaior = numeros.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
        if (segundoMaior.isPresent()) {
            System.out.println("Segundo maior número: " + segundoMaior.get());
        } else {
            System.out.println("Não há segundo maior número.");
        }
    }

    // Desafio 8: Somar os dígitos de todos os números
    void somarDigitos() {
        int somaDigitos = numeros.stream().mapToInt(num -> String.valueOf(num).chars().map(Character::getNumericValue).sum()).sum();
        System.out.println("Soma dos dígitos de todos os números: " + somaDigitos);
    }

    // Desafio 9: Verificar se todos os números são distintos
    void todosDistintos() {
        boolean todosDistintos = numeros.stream().distinct().count() == numeros.size();
        System.out.println("Todos os números são distintos: " + todosDistintos);
    }

    // Desafio 10: Agrupar valores ímpares múltiplos de 3 ou de 5
    void agruparImparesMultiplos() {
        List<Integer> agrupados = numeros.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).collect(Collectors.toList());
        System.out.println("Valores ímpares múltiplos de 3 ou 5: " + agrupados);
    }

    // Desafio 11: Encontrar a soma dos quadrados de todos os números
    void somaQuadrados() {
        int somaQuadrados = numeros.stream().mapToInt(n -> n * n).sum();
        System.out.println("Soma dos quadrados dos números: " + somaQuadrados);
    }

    // Desafio 12: Encontrar o produto de todos os números
    void produtoTodos() {
        int produto = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Produto de todos os números: " + produto);
    }

    // Desafio 13: Filtrar os números que estão dentro de um intervalo (5 a 10)
    void filtrarIntervalo() {
        List<Integer> intervalo = numeros.stream().filter(n -> n >= 5 && n <= 10).collect(Collectors.toList());
        System.out.println("Números no intervalo de 5 a 10: " + intervalo);
    }

    // Desafio 14: Encontrar o maior número primo
    void maiorNumeroPrimo() {
        Optional<Integer> maiorPrimo = numeros.stream().filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).max(Integer::compareTo);
        if (maiorPrimo.isPresent()) {
            System.out.println("Maior número primo: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    // Desafio 15: Verificar se a lista contém pelo menos um número negativo
    void algumNegativo() {
        boolean temNegativo = numeros.stream().anyMatch(n -> n < 0);
        System.out.println("Há pelo menos um número negativo: " + temNegativo);
    }

    // Desafio 16: Agrupar os números em pares e ímpares
    void agruparParesEImpares() {
        Map<Boolean, List<Integer>> agrupados = numeros.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Números pares: " + agrupados.get(true));
        System.out.println("Números ímpares: " + agrupados.get(false));
    }

    // Desafio 17: Filtrar os números primos
    void filtrarPrimos() {
        List<Integer> primos = numeros.stream().filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).collect(Collectors.toList());
        System.out.println("Números primos: " + primos);
    }

    // Desafio 18: Verificar se todos os números são iguais
    void todosIguais() {
        boolean todosIguais = numeros.stream().distinct().count() == 1;
        System.out.println("Todos os números são iguais: " + todosIguais);
    }

    // Desafio 19: Encontrar a soma dos números divisíveis por 3 e 5
    void somaDivisiveis() {
        int soma = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos números divisíveis por 3 e 5: " + soma);
    }

    public static void main(String[] args) {
        App app = new App();

        app.mostrarListaOrdenada();
        app.somaPares();
        app.todosPositivos();
        app.removerImpares();
        app.mediaMaioresQue5();
        app.algumMaiorQue10();
        app.segundoMaior();
        app.somarDigitos();
        app.todosDistintos();
        app.agruparImparesMultiplos();
        app.somaQuadrados();
        app.produtoTodos();
        app.filtrarIntervalo();
        app.maiorNumeroPrimo();
        app.algumNegativo();
        app.agruparParesEImpares();
        app.filtrarPrimos();
        app.todosIguais();
        app.somaDivisiveis();
    }
}
