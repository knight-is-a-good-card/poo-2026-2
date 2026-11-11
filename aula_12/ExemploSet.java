package aula_12;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args){

    
        Set<String> descobertos = new HashSet<>();

        descobertos.add("Moeda");
        descobertos.add("Cristais");

        boolean inseriuDeNovo = descobertos.add("Moeda");

        System.out.println("Tipos diferentes: " + descobertos.size());
        System.out.println("Moeda ja duplicado: " + descobertos.contains("Moeda"));
        System.out.println("Moeda duplicada entrou? " + inseriuDeNovo);
    

        for (String nome : descobertos) {
            System.out.println("Descoberto: " + nome);
        }

}
}
