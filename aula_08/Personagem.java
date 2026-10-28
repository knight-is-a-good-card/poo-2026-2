package aula_08;

import aula_11.Atacante;

public abstract class Personagem implements Atacante{
    private final String nome;
    private int energia;

    public Personagem(String nome, int energiaInicial) {
        if ( nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("nome é obriatorio")
        }
    }

    public String getNome() {
        return nome;
    }
    public int getEnergia() {
        return energia;
    }
    protected final void consumirEnergia(int custo) throws SemEnergiaExecption {
        if (custo <= 0) {
            throw new IllegalArgumentException("Custo de ataque tem que ser positivo");
        }
    }
}
