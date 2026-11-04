package aula_09;

public class Pocao {
    private final String nome;
    private final int recuperacao;

    public Pocao(String nome, int recuperacao){
        if (nome == null || nome.isBlank() || recuperacao <= 0){
            throw new IllegalArgumentException("Pocao deve ter nome e valor");
        }
        this.nome = nome;
        this.recuperacao = recuperacao;
    }

public String getNome() {return nome;}
public int getRecuperacao() {return recuperacao;}

@Override 
public String toString() { return nome + " recupera " + recuperacao;}
}
