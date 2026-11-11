package aula_12;

import java.util.Map;
import java.util.HashMap;

public class ExemploMap {
    public static void main(String[] args){

        Map<String, Integer> quantidades = new HashMap<>();
        adicionar(quantidades, "Moeda");
        adicionar(quantidades, "Moeda");
        adicionar(quantidades, "Critais");

        System.out.println("Moedas: " + quantidades.getOrDefault("Moeda",0));
        System.out.println("Espadas: " + quantidades.getOrDefault("Espada",0));

        for (Map.Entry<String, Integer> entrada : quantidades.entrySet()){
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
        }
    }

    private static void adicionar(Map<String, Integer> mapa, String nome){
        int quantidadeAtual = mapa.getOrDefault(nome, 0);
        mapa.put(nome, quantidadeAtual + 1);
    }
}