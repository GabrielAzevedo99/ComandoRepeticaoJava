//15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a 
//soma desses números. Encerre a execução quando um número negativo for digitado.

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio15 {
    
    public static void main (String[]args) {
    
    Scanner texto = new Scanner(System.in);
 
    int soma = 0; 
    
    while (true) {
        
        System.out.print("Digite numeros e 0 para parar ");
        int n = texto.nextInt();
     
    if (n == 0){
         break;
           
        } 
    soma += n;
    }
   System.out.println("A soma dos numeros deu "+ soma);
}
}
