package aula_12;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    
    public static void main(String[] args){
        List<String> historico = new ArrayList<>();

        historico.add("Moeda");
        historico.add("Cristais");
        historico.add("Moeda");

        System.out.println("Baus abertos: " + historico.size());
        System.out.println("Primeiro item: " + historico.get(0));

        for (String item : historico){
            
        }

    }
}
