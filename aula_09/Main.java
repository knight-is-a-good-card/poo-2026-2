package aula_09;

public class Main {
    public static void main(String [] args) {

        Inventario<Arma> arsenal = new Inventario<>();
        arsenal.guardar(new Arma("Espada", 8));
        arsenal.guardar(new Arma("Arco", 5));

        Inventario<Pocao> bolsa = new Inventario<>();
        bolsa.guardar(new Pocao("Cura", 10));


        Arma armaAtual = arsenal.pegar(0);
        Pocao pocaoAtual = bolsa.pegar(0);

        System.out.println("Arma: " + armaAtual.getNome());
        System.out.println("Pocao: " + pocaoAtual.getNome());
        System.out.println("Arma guardadas: " + arsenal.qualidade());

}
}
