/*Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um	
número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não,	um	
limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente	
pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o	
cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa	
para	testar	essa	classe.*/

package exercicios_de_java.aula25a27;

public class Exercicio_02_ContaCorrente {
	String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;
    
    void sacar(double saque) {
    	if(this.saldo > saque) {
    		 this.saldo = this.saldo - saque;
    		 System.out.printf("valor do saque : %.2f", saque);
    	}else {
    		System.out.println("saque recusado saldo insuficiente");
    	}
    }
    
    void depositar(double deposito) {
    	this.saldo = this.saldo  + deposito;
    	System.out.printf("depositado:  %.2f ",deposito);
    	}
    
    void getsaldo() {
    	System.out.println("Saldo atual: %.2f".formatted(this.saldo));
    }

}

   
