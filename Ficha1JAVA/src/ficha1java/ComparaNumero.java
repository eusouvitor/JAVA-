
package ficha1java;

/**
 *
 * @author vnimschofsky
 */
public class ComparaNumero {
    
    public void compara(int a, int b){
        if(a==b)
            System.out.println("Os valores sao iguais");
        else{
            System.out.println("Os valores sao diferentes");
            if(a>b)
                System.out.println("O maior : "+a+"\nO menor : "+b);
            else
                System.out.println("O maior : "+b+"\nO menor : "+a);
        }
    }
    
}
