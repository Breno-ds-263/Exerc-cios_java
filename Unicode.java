public class Unicode {
     
public static void main(String[] args) {
    String vetor[]={"x", "D", "A","C", "B","H" };
    
    
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
    System.out.println("vetor ordenado");
    for(int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
    }
}

    
}
