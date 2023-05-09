//4)  Leia o nome um número do usuário um número N  e  escreva o nome dele na tela N vezes. 

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
    System.out.printf("Digite seu nome: ");
     String nome = texto.next();
     
     System.out.printf("Digite quantas vezes voce quer que apareca seu nome ");
     int n = texto.nextInt();
     
        for ( int i = 1; i <= n; i++) {
                
            System.out.print( "\n" + nome);
        
    }    
}
}
