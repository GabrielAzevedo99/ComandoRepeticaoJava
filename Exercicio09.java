//9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. 

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
    int menor = Integer.MAX_VALUE;
    String nomeMenor = "";
    
            for ( int i = 1; i <= 10; i++) {
                
              System.out.printf("Digite seu nome ");
              String nome = texto.next();
               
              System.out.printf("Digite sua idade ");
              int idade = texto.nextInt();

            if (idade < menor) {
                menor = idade;
                nomeMenor = nome;
            }
        }
        System.out.println("Pessoa Mais nova Nome: " + nomeMenor +" Pessoa mais nova idade "+ menor);     
    }
   }
