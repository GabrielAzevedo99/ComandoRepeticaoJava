//11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são 
//maiores do que 8.

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
 
    int menor = 0;
    
            for ( int i = 1; i <= 20; i++) {
                
              System.out.printf("Digite um numero");
              Double n = texto.nextDouble();
              
              if (n > 8){
               menor++;
              }
    
}
            System.out.print(menor + " numeros são maiores que oito.");
    }
}
