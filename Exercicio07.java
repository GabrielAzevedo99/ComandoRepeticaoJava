//7) Leia a idade de 20 pessoas e exiba a média das idades.

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
    int soma = 0;
    
            for ( int i = 1; i <= 20; i++) {
               
              System.out.printf("Digite sua idade ");
              int idade = texto.nextInt();
              
              soma += idade;
              
            }
            System.out.println("A media das idades deu "+ soma / 20);
    }
}
