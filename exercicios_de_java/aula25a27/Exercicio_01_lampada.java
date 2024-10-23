/*Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
para	ligar,	desligar	a	lampada.*/

package exercicios_de_java.aula25a27;

public class Exercicio_01_lampada {
	
	String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligado;
    
    void ligar() {
    	ligado = true;
    	}
    void desligar() {
    	ligado = false;
    	}
    void mostrarestado() {
    	if(ligado == true) {
    		System.out.println("Lampada ligada");
    	}else {
    		System.out.println("Lampada desligada");
    		
    	}
    }
    
    

}
