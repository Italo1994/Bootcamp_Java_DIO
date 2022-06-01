package br.com.dio.Set;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.4));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("SOMA = " + soma);

        System.out.println("\nExiba a média das notas: " +(soma / notas.size()) );

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        Set<Double> notas2 = new HashSet<Double>(notas);
        System.out.println(notas2);

        System.out.println("Limpando toda a lista: ");
        notas2.clear();

        System.out.println("Verificando se o conjunto 1 está vazio: "+ notas.isEmpty());
        System.out.println("Verificando se o conjunto 2 está vazio: "+ notas2.isEmpty());
    }
}
