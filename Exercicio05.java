//5)  Escreva  um  algoritmo  que  leia  10  números  do  usuário  e  calcule  a  soma  desses números.

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio05 {
    
        public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
    
    int soma = 0;
    
            for ( int i = 1; i <= 10; i++) {
                
                System.out.printf( " Digite num ");
             int n = texto.nextInt();
             
          soma += n;
}
            System.out.printf( " A soma dos numeros deu "+ soma);

        }
}
