
package ficha1java;


 //@author vnimschofsky
 
public class TrocaNumero {
    
    public void troca(int numA,int numB){
        int temp;
        temp = numA;
        numA = numB;
        numB = temp;  
        System.out.println("O primeiro valor agora é : "+numA+" e o segundo valor é : "+numB);
    }
    
}
