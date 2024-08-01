import java.util.Random;

public class BubleeSort {
    public static void main(String[] args) {

        int vetor[] = vetor();

        System.out.println("Vetor não ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%6d",  vetor[i]);
        }
        System.out.println();
        
        int x;

        for(int i = 1; i < vetor.length; i++){
            for(int j = vetor.length - 1; j >=i; j--){
                if(vetor[j-1] > vetor[j]){
                    x = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j]= x;
                }
            }
        }
        System.out.println("vetor ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%6d",  vetor[i]);
        }

    }
    
    public static int [] vetor(){
        Random radom = new Random();
        
        int vetor[] = new int[10];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = radom.nextInt(20);

        }
         return vetor;
        


    }
}
