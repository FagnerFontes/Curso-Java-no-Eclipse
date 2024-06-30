package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
  
   - Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */
import java.util.Scanner;

public class populacao2 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        System.out.print("Qual a população atual do país A: ");
        int paisA = porta.nextInt();

        System.out.print("Qual a taxa de crescimento do país A: ");
        double taxaCrescimentoA = porta.nextDouble(); 
        
        System.out.print("Qual a população atual do paìs B: ");
        int paisB = porta.nextInt();

        System.out.print("Qual a taxa de crescimento do país B: ");
        double taxaCrescimentoB = porta.nextDouble(); 
       
        int anos = 0; 

        while (paisA <= paisB) { 
            paisA += (int) (paisA * taxaCrescimentoA);
            paisB += (int) (paisB * taxaCrescimentoB);

            anos++; 
        }
       
        System.out.println("Numero de anos necessários: " + anos);
        
    }
}
