package aula_03;

public class Armadura {
    String nome;
    int defesa;

    Armadura(String nome, int defesa) {
        this.nome = nome;
        this.defesa = defesa;
    }

    void exibirStatus() {
        System.out.println("Armadura: " + nome);
        System.out.println("Defesa: " + defesa);
    }

    public int getDefesa() {
        return defesa;
    }
}
