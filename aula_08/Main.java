package aula_08;

public class Main{
    public static void cadastrar(String nome, int energia) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatorio");
        }
        if (energia < 0) {
            throw new IllegalArgumentException("energia não pode ser negativo");
        }
        System.out.println("Cadastro aceito: " + nome + " , energia: " + energia);
}


private static void tentar(int energia) {
    try {
        if (energia == 0) {
            throw new IllegalArgumentException("Não pode atacar sem energia");
        }
    } catch (IllegalArgumentException erro) {
        System.out.println("Ataque recusado")
    }
}
    
}