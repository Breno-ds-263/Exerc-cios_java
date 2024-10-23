package exercicios_de_java.aula25a27;

public class ContaCorrente {

	public static void main(String[] args) {
		Exercicio_02_ContaCorrente Conta = new Exercicio_02_ContaCorrente();
		
		Conta.agencia = "nubank";
		Conta.especial = false;
		Conta.limiteEspecial = 3000;
		Conta.numero = "1423";
		Conta.saldo = 5000;
		
		Conta.getsaldo();
		System.out.println();
		Conta.sacar(3000);
		System.out.println("");
		
		Conta.depositar(80000);
		System.out.println("");
		
		Conta.getsaldo();
	}

}
