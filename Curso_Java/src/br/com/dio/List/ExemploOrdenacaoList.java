package br.com.dio.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<Gato>(){{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 12, "tigrado"));
           add(new Gato("Jon", 6, "amarelo"));
        }};

        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(gatos);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem natural (Nome)\t---");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem Idade\t---");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);


    }
}