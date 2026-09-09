package aula_05;

public class Jogo {
    
    private String titulo;
    private String plataforma;
    private int classificacao;

    public void exibirStatus() {
        System.out.println("Título: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Classificação: " + classificacao);
    }
}
