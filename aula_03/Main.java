package aula_03;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem("Arthur", 100, 25, 2);
        Personagem goblin = new Personagem("Goblin", 45, 10, 1);
        Personagem mago = new Personagem("Merlin", 70, 30, 5);
        Personagem coveiro = new Personagem("Regger", 85, 20, 3);

        guerreiro.exibirStatus();
        goblin.exibirStatus();
        mago.exibirStatus();
        coveiro.exibirStatus();

        Arma espada = new Arma("Espada de Ferro", 15);
        Arma machado = new Arma("Machado Duplo", 25);
        Arma cajado = new Arma("Cajado de Ossos", 30);
        Arma pa = new Arma("Pá dos Mortos", 10);


        espada.exibirStatus();
        machado.exibirStatus();
        cajado.exibirStatus();
        pa.exibirStatus();

        guerreiro.equipar(espada);

        coveiro.equipar(pa);

        guerreiro.atacar(goblin, true);
    }
}