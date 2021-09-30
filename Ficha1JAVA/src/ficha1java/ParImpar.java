
package ficha1java;


 // @author vnimschofsky

public class ParImpar {
    
   public void parImpar(){
       int x, soma=0;
       long resmult=1;
       for(x=1;x<=30;x++){
           if(x%2==0){
               resmult*=x;
           }
           else
               soma+=x;
       }
       System.out.println("Resultado Multiplicado Pares "+resmult);
       System.out.println("Resultado Soma Impares "+soma);
   }
}
