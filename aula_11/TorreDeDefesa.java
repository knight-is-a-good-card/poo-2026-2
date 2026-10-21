package aula_11;

public class TorreDeDefesa implements Atacante{
    private String local;

    public TorreDeDefesa(String local){
        this.local = local;
    }

    @Override 
    public void atacar(){
        System.out.println("A torre disparou");
    }
    
}
