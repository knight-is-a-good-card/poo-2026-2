package aula_09;

import aula_11.Atacante;

public class Personagem implements Atacante{
    private final String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("nome obrigatorio!");
        }
        if (energia < 0 ){
            throw new IllegalArgumentException("energia não pode ser negativo!");
        }
        this.nome = nome;
        this.energia = energia;
    }

public String getNome() {return nome;}
public String getEnergia() {return energia;}

protected void consumirEnergia(int custo) throws semEnergiaException{
    if (custo <= 0) {
        throw new
    }
}
}
