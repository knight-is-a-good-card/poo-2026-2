package aula_05;

public class Emprestimo {
    
    private Cliente cliente;
    private Jogo jogo;
    private boolean status;

    public void dados() {
        cliente.exibirDados();
        jogo.exibirStatus();
        System.out.println("Status: " + status);
    }
}
