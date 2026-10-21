package aula_11;

public class Main {
    public static void main(String[] args){

        System.out.println("===============");

        Atacante[] atacantes = {
            new Guerreiro("joaozinho"),
            new Mago("Merlin"),
            new Armadilha("espinhos"),
            new TorreDeDefesa("Torre"),
            new Arqueiro("Robin")
        };

        for (Atacante item : atacantes) {
            item.atacar();
        }
    }
}
