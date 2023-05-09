//3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

package comandorepeticaoJava;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main (String[]args) {
        
        Scanner texto = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = texto.next();
        
        for ( int i = 0; i <=10; i++) {
                
            System.out.print( "\n" + nome);
        
    }
    
}
}
