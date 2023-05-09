//2) Escreva um algoritmo que calcule a soma dos números de 1 a 15. 

package comandorepeticaoJava;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        int n1 = 1;
        int soma = 0;
      
            while (n1 <= 15) {
                System.out.printf("\n"+ n1);
                n1++;
                
                soma += n1;
            }
            
            System.out.printf("\n A soma deu "+ soma);
    }
}

