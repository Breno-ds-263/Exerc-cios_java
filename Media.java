import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0;


        for(int i = 0; i < 3; i++){
            System.out.println("insira sua nota:");

           double num =  input.nextDouble();

           soma = soma + num;
        }

        double media = soma/3;
        System.out.println(media);


    }
}
