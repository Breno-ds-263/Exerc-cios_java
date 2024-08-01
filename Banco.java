

public class Banco {
    int numero;
    String nome;
    double saldo;
    double limite;

    public Banco(int numero, String nome, double saldo, double limite){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }


    public static void main(String[] args) {
        Banco conta = new Banco(1234, "Breno", 8654, 50000);

        System.out.println(conta.saldo);
    }
}
