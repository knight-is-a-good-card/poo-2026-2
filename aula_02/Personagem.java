public class Personagem {

    
        String nome;
       

        int nivel;
        int vida;
        int forca;
        

        void exibirStatus() {
            System.out.println("Nome: " + nome);
            System.out.println("Nivel: " + nivel);
            System.out.println("Vida: " + vida);
            System.out.println("Força: " + forca);
            
        }

        void atacar(Personagem monstro) {
            monstro.vida = monstro.vida - forca;

            System.out.println("Nome: " + nome);
            System.out.println(monstro.vida);
        }

        

    }