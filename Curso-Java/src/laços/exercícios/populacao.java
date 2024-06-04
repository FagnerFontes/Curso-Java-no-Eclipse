package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

 */
import java.util.Scanner;

public class populacao {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        int paisA = 20000; 
        double taxaCrescimentoA = 0.05; 

        int paisB = 5000;
        double taxaCrescimentoB = 0.10; 
        int anos = 0; 

        while (paisB <= paisA) { 
            paisA += (int) (paisA * taxaCrescimentoA);
            paisB += (int) (paisB * taxaCrescimentoB);

            anos++; 
        }
       
        System.out.println("Numero de anos necessários: " + anos);
        
    }
}
