import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("informe o primeiro nome");
    String nome = input.nextLine();

    System.out.println("informe o segundo nome");
    String nome2 = input.nextLine();

    if(nome.equals(nome2)){
        System.out.println("os nomes são iguais");
    }

    else{
        System.out.println("os nomes são diferentes");
    }
    
}
}
