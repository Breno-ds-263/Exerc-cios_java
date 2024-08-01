import java.util.Scanner;

public class ProgramaOrdenacao {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  

    int opcao = input.nextInt();

    
        switch (input) {
            case 1:
                ordenecao.ordenarnumeros(null);
                break;
        
            case 2:
                ordenecao.ordenarletras(args);
                break;
        }

    
        
    }

    public class ordenecao{

        public static void ordenarnumeros(int []vetor){

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
        }

    public static void ordenarletras(String []vetor){

         
    String x;
    
    for(int i = 1; i < vetor.length; i++){
        for(int j = vetor.length - 1; j >=i; j--){
            if(vetor[j-1].compareTo(vetor[j]) > 0){
                x = vetor[j-1];
                vetor[j-1] = vetor[j];
                vetor[j]= x;
            }
        }
    }

    }
    }
    
}
