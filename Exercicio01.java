//1) Escreva um  algoritmo  que exiba 20 vezes  a mensagem  “Eu gosto  de estudar Algoritmos!”.

package comandorepeticaoJava;

import javax.swing.JOptionPane;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int n1=1;
        
            while (n1 <= 20) {
                JOptionPane.showMessageDialog(null, " Eu gosto  de estudar Algoritmos! " + n1);
                n1++;
            }
    }
}
     
 
