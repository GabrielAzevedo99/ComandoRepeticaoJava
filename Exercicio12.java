//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são 
//pares

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
    int soma = 0;
    
            for ( int i = 1; i <= 20; i++) {
                
              System.out.printf("Digite um numero ");
              Double n = texto.nextDouble();
              
              if (n %2 == 0){    
             soma++;              
              
              } 
              
}
            System.out.printf("temos "+ soma + " numeros pares");
    }
}
