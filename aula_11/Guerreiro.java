package aula_11;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome) {
        super(nome);
    }
    
    @Override 
    public void atacar(){
        System.out.println("Guerriero atacou com sua espada");
    }
}
