//8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
    int maior = 0;
    
            for ( int i = 1; i <= 20; i++) {
               
              System.out.printf("Digite sua idade ");
              int idade = texto.nextInt();
       
              if (idade >= 18){ 
                 maior++;
                 
              }
    }
            System.out.printf( maior + " pessoas são maiores de idade");
}}
