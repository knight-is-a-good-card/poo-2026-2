package aula_08;

import aula_11.Atacante;

public class Armadilha implements Atacante{
    private final String tipo;

    public Armadilha(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("Tipo é obrigatorio");
        }
        this.tipo = tipo;
    }

    @Override 
    public void atacar() {
        System.out.println("Armadilha " + tipo + " disparou");
    }
}
