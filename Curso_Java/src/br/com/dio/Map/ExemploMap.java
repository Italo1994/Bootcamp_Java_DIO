package br.com.dio.Map;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carros = new HashMap<>() {{
            put("cross fox", 12.5);
            put("gol", 13.8);
            put("t cross", 9.5);
            put("polo", 10d);
            put("golf", 9.8);
        }};
        System.out.println(carros.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("Confira se o modelo Tucson está no dicionário: "+ carros.containsKey("cross fox"));

        System.out.println("Exiba o consumo do Polo: " + carros.get("polo") + " km/l");

        System.out.println("Exiba os modelos dos carros: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        double consumoMaisEficiente = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry : entries) {
            if(entry.getValue() == consumoMaisEficiente) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: "+ modeloMaisEficiente + " - "+ consumoMaisEficiente + " km/l");
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        double consumoMenosEficiente = Collections.min(carros.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry : carros.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+ modeloMenosEficiente + " - " + consumoMenosEficiente + " km/l");
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        double soma = 0d;
        while(iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma = "+soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: ");
        System.out.println("Média = " + (soma/carros.size()));

        System.out.println("Remova os modelos com o consumo maior que 12.5 km/l: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while(iterator1.hasNext()) {
            double next = iterator1.next();
            if(next > 12.5) {
                iterator1.remove();
            }
        }
        System.out.println(carros.toString());

        System.out.println("Exiba os modelos na ordem em que foram inseridos: ");
        Map<String, Double> carros1 = new LinkedHashMap<>() {
            {
                put("cross fox", 12.5);
                put("gol", 13.8);
                put("t cross", 9.5);
                put("polo", 10d);
                put("golf", 9.8);
            }
        };
        System.out.println(carros1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2.toString());

        System.out.println("Apague o dicionário de carros: ");
        carros1.clear();

        System.out.println("Confira se o dicionário 1 está vazio: "+ carros1.isEmpty());
    }
}
