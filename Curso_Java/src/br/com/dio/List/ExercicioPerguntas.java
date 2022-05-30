package br.com.dio.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ExercicioPerguntas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pergunta = "";
        int testePergunta = 0;
        int respostasSim = 0;

        List<String> perguntas = new ArrayList<String>() {{
           add(new String("Telefonou para a vítima?"));
           add(new String("Esteve no local do crime?"));
           add(new String("Mora perto da vítima?"));
           add(new String("Devia para a vítima?"));
           add(new String("Já trabalhou com a vítima?"));
        }};

        Iterator<String> iterator = perguntas.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            pergunta = scan.next();

            testePergunta = pergunta.compareToIgnoreCase(next);

            if(testePergunta == 0) {
                respostasSim++;
            }
        }

        Iterator<String> iterator1 = perguntas.iterator();
        while(iterator1.hasNext()) {
            switch(respostasSim) {
                case 1:
                case 2:
                    System.out.println("Suspeita");
                    break;
                case 3:
                case 4:
                    System.out.println("Cúmplice");
                    break;
                case 5:
                    System.out.println("Assassina");
                    break;
                default:
                    System.out.println("Inocente");
                    break;
            }
        }
    }
}
