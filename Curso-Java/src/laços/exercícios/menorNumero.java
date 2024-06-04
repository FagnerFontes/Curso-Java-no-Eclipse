package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
 */
import java.util.Scanner;

public class numerosInteiros {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = porta.nextInt(); 

        System.out.print("Digite o segundo número: ");
        int num2 = porta.nextInt();
        

    System.out.println("menor número: " + Math.min(num1, num2));
    System.out.println("maior número: " + Math.max(num1, num2));
        
    }
}
