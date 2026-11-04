package aula_09;

public class Arma {
    private final String nome;
    private final int dano;

    public Arma(String nome, int dano){
        if (nome == null || nome.isBlank() || dano <= 0) {
            throw new IllegalArgumentException("Arma deve ter um nome e um dano");
        }
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {return nome;}
    public int getDano() {return dano;}

    @Override 
    public String toString() {return nome + " dano: " + dano;}
}
