
package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

   * Podemos criar um programa em Java para gerar a série de Fibonacci até o enésimo termo solicitado pelo usuário. 
 */
import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        //Solicita ao usuário o número de termos desejados na série de Fibonacci; 
        System.out.print("Digite o número de termos da série Fibonacci: ");
        int n = porta.nextInt();

        //Verifica se o número de termos é válido (n >= 0)
        if (n < 0) {
            System.out.print("O número de termos deve ser maior que zero.");
        } else {
            //Chama o método para gerar e exibir a serie de Fibonacci. 
            System.out.println("Serie de Fibonnaci com " + n + " termos: ");
            gerarFibonacci(n);
        }    
    }


//método para gerar e exibir a série de Fibonacci até o enésimo termo

public static void gerarFibonacci(int n ){
    int termo1 = 0;  
    int termo2 = 1;

//Calcula e imprime os dois termos da série de Fibonnacci
System.out.println(termo1 + " " + termo2 + " ");

// Calcula e imprime os próximos termos da série de Fibonacci
for (int i = 2; i < n; i++) {
    int proximoTermo = termo1 + termo2;
    System.out.print(proximoTermo + " ");
    termo1 = termo2;
    termo2 = proximoTermo;

        }
	}
}