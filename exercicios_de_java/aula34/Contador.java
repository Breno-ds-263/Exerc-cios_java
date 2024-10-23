/*. Escreva	uma classe chamada	Contador,	que	tem	um	atributo	estático	que	
é	incrementado	sempre	que	a	classe	for	instanciada. Crie	métodos	para	
zerar,	incrementar	e	retornar	o	valor	do	contador. Desenvolva	um	
programa	para	testar	essa	classe.*/

package exercicios_de_java.aula34;

public class Contador {
	
	private static int contador;
	
	
	
	public Contador() {
		this.contador++;
	}

	public int getContador() {
		return this.contador;
		}
	
	public void zerarContador() {
		this.contador = 0;
	}
	
	public void incrementarContador() {
		this.contador++;
	}
	
	public void retornarContador() {
		this.contador--;
	}

}
