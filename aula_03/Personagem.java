package aula_03;

public class Personagem {
    private String nome;
    private int vida;
    private int vidaMaxima;
    private int forca;
    private int nivel;

    private Arma arma;
    private Armadura armadura;

    Personagem(String nome, int vidaMaxima, int forca, int nivel) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.forca = forca;
        this.nivel = nivel;
    }

    void exibirStatus() {
        System.out.println("Nome " + nome);
        System.out.println("Vida " + vida);
        System.out.println("Força " + forca);
        System.out.println("Nivel " + nivel);
        System.out.println("Vida Maxima " + vidaMaxima);
    }

    void equiparArma(Arma novaArma) {
        arma = novaArma;
        System.out.println(nome + " Equipou: " + arma.nome);
    }

    void equiparArmadura(Armadura novaArmadura) {
        armadura = novaArmadura;
        System.out.println(nome + " Equipou: " + armadura.nome);
    }

    void atacar(Personagem alvo, boolean defender) {
        int danoTotal = forca;
        if (arma != null) {
        danoTotal += arma.dano;
        }
        

        if (defender == true) {
            danoTotal = danoTotal / 2;
        }
    

        alvo.receberDano(danoTotal);

        System.out.println(nome + " atacou: " + alvo.nome);
        System.out.println("Dano causado: " + danoTotal);
        System.out.println(alvo.nome + " ficou com " + alvo.vida + "de vida");
    }

    void receberDano(int dano) {
        int defesa = 0;

        if (armadura != null) {
          defesa = armadura.getDefesa();
        }

        vida = dano - defesa;

        if (vida < 0) {
        vida = 0;
    }
        
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
