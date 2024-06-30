package laços.enquantoFaça;

/* =============== Validação de Entrada ==================
   -Peça ao usuário para digitar um número entre 1 e 10. Continue solicitando a entrada até que um número seja digitado. 
 */
import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        int numero;

        do {
            System.out.print(" Digite um número entre (1 e 10): ");
            numero = porta.nextInt();

        } while (numero < 1 || numero > 10);

        System.out.println("Ops. Programa encerrado");
    }
}
