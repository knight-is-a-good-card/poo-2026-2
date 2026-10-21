package aula_11;

public class Mago extends Personagem{
    public Mago(String nome) {
        super(nome);
    }
    @Override 
    public void atacar(){
        System.out.println("Mago atacou com sua magia");
    }
}
