package br.com.dio.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.2);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " +notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 0.0 pela nota 6.0: ");
        notas.set(notas.indexOf(0.0), 6d);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " +notas.contains(5d));
        System.out.println(notas);

        System.out.println("\nExiba todas as notas na ordem em que foram informadas: ");
//        for(Double nota: notas) {
//            System.out.println(nota + " ");
//        }

        System.out.println("\nExiba a terceira nota adicionada: " +notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior notas: " + Collections.max(notas));

        System.out.println("\nExiba a soma de todas as notas: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }

        System.out.println("\nExiba a média das notas: " +(soma/notas.size()));

        System.out.println("\nRemova a nota 6.0: ");
        notas.remove(6d);
        System.out.println(notas.toString());

        System.out.println("\nRemova a nota na posição 6: ");
        notas.remove(6);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            double next = iterator1.next();
            if(next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println(notas.isEmpty());
    }
}
