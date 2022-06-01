package br.com.dio.Set;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<Serie>() {{
           add(new Serie("got", "fantasia", 60));
           add(new Serie("dark", "drama", 60));
           add(new Serie("that '70s show", "comédia", 25));
        }};

        for(Serie serie : minhasSeries) {
            System.out.println(serie.getNome());
            System.out.println(serie.getGenero());
            System.out.println(serie.getTempoEpisodio());
        }

        System.out.println("\tOrdem de inserção:");
        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        System.out.println(minhasSeries1.toString());

        System.out.println("\tOrdem natural (TempoEpisodio)");
        Set<Serie> minhasSeries3 = new TreeSet<Serie>(minhasSeries);
        System.out.println(minhasSeries3);
    }
}
