package br.com.dio.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ExercicioTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> temperatura = new ArrayList<Integer>();
        temperatura.add(21);
        temperatura.add(24);
        temperatura.add(17);
        temperatura.add(14);
        temperatura.add(22);
        temperatura.add(25);

        int media = 0;
        int soma = 0;

        Iterator<Integer> iterator = temperatura.iterator();
        while(iterator.hasNext()) {
            int next = iterator.next();
            soma += next;
        }

        media = soma/temperatura.size();
        System.out.println("MÉDIA SEMESTRAL DAS TEMPERATURAS = "+media);

        System.out.println("\nTEMPERATURAS ACIMA DA MÉDIA:");
        Iterator<Integer> iterator1 = temperatura.iterator();
        while(iterator1.hasNext()) {
            int next = iterator1.next();
            int posicao = 0;
            if(next > media) {
                posicao = temperatura.indexOf(next);
                switch (posicao) {
                    case 0:
                        System.out.println("Janeiro - "+next);
                        break;
                    case 1:
                        System.out.println("Fevereiro - "+next);
                        break;
                    case 2:
                        System.out.println("Março - "+next);
                        break;
                    case 3:
                        System.out.println("Abril - "+next);
                        break;
                    case 4:
                        System.out.println("Maio - "+next);
                        break;
                    case 5:
                        System.out.println("Junho - "+next);
                        break;
                    default:
                        System.out.println("Temperatura inválida");
                        break;
                }
            }
        }
    }
}
