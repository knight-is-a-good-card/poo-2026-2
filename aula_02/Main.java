public class Main {
    
    public static void main(String[] args) {

        Personagem guerreiro = new Personagem();

        guerreiro.nome = "Patolino";
        guerreiro.vida = 9999999;
        guerreiro.forca = 9999999;
        guerreiro.nivel = 1000000;

        Personagem monstro = new Personagem();

        monstro.nome = "DaviGulosus";
        monstro.vida = 80;
        monstro.forca = 1;
        monstro.nivel = 5;

        guerreiro.exibirStatus();

        Personagem adversario = new Personagem();

        adversario.nome = "guinomos";
        adversario.vida = 10;
        adversario.forca = 1;
        adversario.nivel = 4;

        guerreiro.exibirStatus();

        Personagem trabalho = new Personagem();

        trabalho.nome = "CLT";
        trabalho.vida = 100;
        trabalho.forca = 1;
        trabalho.nivel = 1932;

        guerreiro.atacar(monstro);
    }
}        
