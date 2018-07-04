
package questao2;

import java.util.Scanner;


public class Questao2 {
   
    
    public static void main(String[] args) {
      q2();
     
    }
   public static void q2(){
        Scanner dados = new Scanner(System.in);
        System.out.println("Genero/numero/cor");
        String genero = dados.next();
        int numero = dados.nextInt();
        String cor = dados.next();
        
        if(genero!="masculino" || genero!="feminino"){
            System.out.println("genero incorreto");            
        }
        else if(genero=="masculino"){
            numero = numero * 3;
        }
        else if(genero=="feminino"){
            numero=numero * 2;
            System.out.println("Numero" + numero);
        }else if(genero=="feminino" & cor =="rosa"){
            numero = numero +5;           
        }
     System.out.println("Genero" + genero);     
     System.out.println("Cor" + cor);
     System.out.println("Numero" + numero);
     }   
    
}
