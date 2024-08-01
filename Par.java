import java.util.Scanner;

class Par{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("insira o numero: ");
        int num = input.nextInt();

        if(num % 2 == 0){

            System.out.println("esse numero é par");
        }

        else{
            System.out.println("esse numero é impar");
        }

        if(num  % 3 == 0 && num % 7 == 0){
          System.out.println("Esse numéro é multiplo de 7 e 3");
        }

        else{
            System.out.println("Esse numéro não é multiplo de 7 e 3");

        }
    }
}