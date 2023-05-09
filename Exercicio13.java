//13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 
//100.

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
    int soma = 0;
    
            for ( int i = 1; i <= 20; i++) {
                
              System.out.printf("Digite um numero ");
              Double n = texto.nextDouble();
              
              if (n >= 0 && n <= 100){    
             soma++;              
              
              } 
              
}
            System.out.printf("temos "+ soma + " numeros entre 0 e 100");
    }
    
}
