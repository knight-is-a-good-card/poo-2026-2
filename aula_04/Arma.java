package aula_04;

public class Arma {
    
    private String nome;
    private int dano;
    
    public Arma(String nome, int dano) {
        if ( nome == null) {
            throw new IllegalArgumentException("O nome da arma não pode");
        }

        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }
}
