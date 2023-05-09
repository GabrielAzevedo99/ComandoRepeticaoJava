//14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 
//100, quantos estão entre 101 e 200 e quantos são maiores de 200.

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio14 {
    
        public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
    int soma = 0;
    int soma2 = 0;
    int soma3 = 0;
    
            for ( int i = 1; i <= 20; i++) {
                
              System.out.printf("Digite um numero ");
              Double n = texto.nextDouble();
              
              if (n >= 0 && n <= 100){    
             soma++;              
              } 
               if (n >= 101 && n <= 200){    
             soma2++;              
              } 
                if (n > 200){    
             soma3++;              
              } 
              
}
            System.out.println("temos "+ soma + " numeros entre 0 e 100");
            System.out.println("temos "+ soma2 + " numeros entre 101 e 200");
            System.out.println("temos "+ soma3 + " acima de 200");
    }
    
}
