package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */
import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        double nota;
       

        do{
            System.out.print("Digite uma nota entre 0 e 10: ");
             nota = porta.nextDouble(); 

        }while(nota <0 || nota >10 );

        
           System.out.println("A nota digitada foi: " + nota);
    }
}
