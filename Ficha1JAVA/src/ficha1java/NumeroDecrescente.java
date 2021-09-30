
package ficha1java;


public class NumeroDecrescente {
    public static int a;
    public void le(){
        System.out.println("Insira um valor");
        a = Ficha1JAVA.ler.nextInt();
    }
    public void desce(){
        le();
        int x;
        for(x=a;x>=0;x--){
            System.out.print(x+" ");
        }
    }
}
