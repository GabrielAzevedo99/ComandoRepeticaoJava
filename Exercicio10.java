/*10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de 
multiplicação.*/ 

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
             System.out.printf("Digite um numero ");
              int n = texto.nextInt();
    
            for ( int i = 1; i <= 10; i++) {
              
              System.out.printf("\n" +n + "x" + i + "= "+ n * i);
            }
    }
}
