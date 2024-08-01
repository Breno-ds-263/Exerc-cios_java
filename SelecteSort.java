import java.util.Scanner;
import java.util.Random;


public class SelecteSort {

    public static void main(String[] args) {

       int  vetor [] = vetor();


       System.out.println("-------------Vetor não ordenado----------");
       for(int i =0 ; i < vetor.length; i++){
        System.out.printf("%8d", vetor[i]);
       }

       System.out.println();
       
    int menor, x;

    for(int i = 0; i < vetor.length; i++){
        menor = i;
        x= vetor[i];
    for(int j = i + 1; j < vetor.length; j++){
        if(x > vetor[j]){
            menor = j;
            x = vetor[j];
        }
    }
    
    vetor[menor] = vetor[i];
    vetor[i]= x;
    }

       System.out.println("-------------Vetor ordenado----------");
       for(int i =0 ; i < vetor.length; i++){
        System.out.printf("%8d", vetor[i]);
       }
        
    }

    static int[] vetor(){
        int vetor []= new int[5];

        Random radom = new Random();

        for(int i = 0; i < vetor.length; i++){

            vetor [i] = radom.nextInt(50);

        }

        return vetor;


    }
    
}
