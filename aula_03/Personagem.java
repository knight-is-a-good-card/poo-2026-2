package aula_03;

public class Personagem {
    String nome;
    int vida;
    int forca;
    int nivel;

    Arma arma;

    Personagem(String nome, int vida, int forca, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.nivel = nivel;
    }

    void exibirStatus() {
        System.out.println("Nome " + nome);
        System.out.println("Vida " + vida);
        System.out.println("Força " + forca);
        System.out.println("Nivel " + nivel);
    }

    void equipar(Arma novaArma) {
        arma = novaArma;
        System.out.println(nome + " Equipou: " + arma.nome);
    }

    void atacar(Personagem alvo, boolean defender) {
        int danoTotal = forca;
        if (arma != null) {
        danoTotal += arma.dano;
        }
        alvo.vida -= danoTotal;

        if (defender == true) {
            danoTotal = danoTotal / 2;
        }

        alvo.receberDano(danoTotal);

        System.out.println(nome + " atacou: " + alvo.nome);
        System.out.println("Dano causado: " + danoTotal);
        System.out.println(alvo.nome + " ficou com " + alvo.vida + "de vida");
    }

    void receberDano(int dano) {
        vida -= dano;
        if (!estavivo()) {
            System.out.println(nome + " foi derrotado");
        }
        System.out.println(nome + " recebeu " + dano + " de dano.");
        System.out.println("Vida restante: " + vida);
    }

    void cura(int cura) {
        vida = vida + cura;
    }

    void critico(int critico) {
        forca = forca + critico;
    }

    void defender(int defender) {

    }

    boolean estavivo() {
        return vida > 0;
    }

    
}
