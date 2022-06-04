package br.com.dio.Map;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;

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

        double consumoMenosEficiente = Collections.min(carros.values());
        for(Map.Entry<String, Double> entry : carros.entrySet()) {
            
        }
    }
}
