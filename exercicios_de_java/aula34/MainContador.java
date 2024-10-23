package exercicios_de_java.aula34;

public class MainContador {

	public static void main(String[] args) {
		Contador contador = new Contador();
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();
		Contador contador4 = new Contador();
		
		System.out.println(contador.getContador());
		
		
		contador.retornarContador();;
		
		
		System.out.println(contador.getContador());

	}

}
