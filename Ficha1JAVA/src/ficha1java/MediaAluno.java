
package ficha1java;

/**
 *
 * @author vnimschofsky
 */
public class MediaAluno {
    
    int notas[] = new int[5];
    public void registraNotas() {
        int x;
        for(x=0;x<5;x++){
          do{
            System.out.println("Insira uma nota [0 - 100]");
            notas[x] = Ficha1JAVA.ler.nextInt();
            if(notas[x]<0 || notas[x]>100)
                System.out.println("Valor invalido");
          }while(notas[x]<0 || notas[x]>100);
        
        }
    
    }
    public void mediaAluno(){
        int x, soma=0;
        float media;
        registraNotas();
        for(x=0;x<5;x++){
            soma+=notas[x];
            }
        media = (float)soma/(float)5;
        System.out.println("A média de notas do aluno:"+media);
    
    }
       
       
        
    
}
