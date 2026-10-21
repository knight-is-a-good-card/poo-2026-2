package aula_10;

public class Personagem {
    private String nome; 

    public Personagem(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract class Personagem{
        private final String nome;
        private Personagem(String nome);
    }
    
}
