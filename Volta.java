import java.util.Random;
import java.util.Scanner;
import java.util.random.*;


public class Volta{

public static void main(String[] args) {
    int vetor[] = new int[0];
    vetor = criarvetor(10);

    //loop para visualizar o vetor 
    System.out.println("---------vetor desordenado--------");
    for(int i = 0; i < vetor.length; i++){
        System.out.printf("%3d",vetor[i]);
        
    }
    System.out.println();

    ordenarvetor(vetor);

    System.out.println("---------vetor ordenado--------");
    for(int i = 0; i < vetor.length; i++){
        System.out.printf("%3d",vetor[i]);
        
    }
    

}

public static int []criarvetor(int x){
     
    int vetor [] = new int[x];

    for(int i = 0; i < vetor.length; i++ ){
        Random random = new Random(); 

        vetor[i] = random.nextInt(10);
    }
    return vetor;
}

public static void ordenarvetor(int []vetor){

    for(int i = 0; i < vetor.length; i++){
        int menor = i;
        int aux = vetor[i];
        for(int j = i+1; j < vetor.length; j++){
            if(vetor[i]>vetor[j]){
                menor = j;
                aux = vetor[j];
            }
        }
        vetor[menor] = vetor[i];
        vetor[i] = aux;

    }

}
}

