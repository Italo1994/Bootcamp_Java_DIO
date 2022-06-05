package testes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt(); // número total de figurinhas no álbum
        int M = leitor.nextInt(); // número de figurinhas compradas
        int faltam = N-M; // quantas figurinhas faltam

        if(faltam < 0) {
            faltam = 0;
        }
        List<Integer> compradas = new ArrayList<Integer>();

        for (int i = 0; i < M; i++) {
            compradas.add(leitor.nextInt());
        }

        List<Integer> copiaCompradas = new ArrayList<Integer>(compradas);
        int count = 0;

        Iterator<Integer> iterator = compradas.iterator();
        Iterator<Integer> iterator2 = copiaCompradas.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            while(iterator2.hasNext()) {
                Integer next2 = iterator2.next();

                if(count != 0) {
                    if(next == next2) {
                        faltam++;
                    }
                }

                count++;
            }
            count = 0;
        }

        System.out.println(faltam);

    }
}
