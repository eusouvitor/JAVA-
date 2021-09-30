
package ficha1java;

import java.util.Scanner;


public class Ficha1JAVA {

    public static Scanner ler = new Scanner(System.in);
    public static int v1,v2;
    public static void main(String[] args) {
        MaiorNumero m = new MaiorNumero();
        NumeroDecrescente n = new NumeroDecrescente();
        ParImpar p = new ParImpar();
        TrocaNumero t = new TrocaNumero();
        ComparaNumero c = new ComparaNumero();
        MediaAluno d = new MediaAluno();
        int op;
        do{
            System.out.println("--- MENU ---");
            System.out.println("0 - Sair");
            System.out.println("1 - Maior de 2");
            System.out.println("2 - Mostra numeros em ordem decrescente");
            System.out.println("3 - Mostra impar e par");
            System.out.println("4 - Troca de Valores");
            System.out.println("5 - Compara numeros");
            System.out.println("6 - Media do Aluno");
            op=ler.nextInt();
            switch(op){
                case 0: break;
                case 1: leDados(); m.maior2(v1, v2); break;
                case 2: n.desce(); break;
                case 3: p.parImpar(); break;
                case 4: leDados(); t.troca(v1,v2); break;
                case 5: leDados(); c.compara(v1, v2); break;
                case 6: d.mediaAluno(); break;
                default: System.out.println("Insira uma opção válida");
            }  
        }while(op!=0);   
    }
    
    public static void  leDados(){
        System.out.println("Insira um valor");
        v1 = ler.nextInt();
        System.out.println("Insira um segundo valor");
        v2 = ler.nextInt();
}
}
