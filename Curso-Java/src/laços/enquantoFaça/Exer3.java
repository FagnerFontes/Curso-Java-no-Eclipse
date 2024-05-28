package laços.enquantoFaça;

/* =============== Validação de Entrada ==================
   -Peça ao usuário para digitar um número entre 1 e 10. Continue solicitando a entrada até que um número seja digitado. 
 */
import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        int numero;//Declara uma variável int 

        do {//Aqui o programa pede para o usuário digitar um número e lê esse número 
            System.out.print(" Digite um número entre (1 e 10): ");
            numero = porta.nextInt();

          // Aqui o laço continua se o número não estiver entre 1 e 10. Isso siginifica que o laço vai se repetir se o número for menor que 1 ou maior que 10
        } while (numero < 1 && numero > 10);

        System.out.println("Ops. Programa encerrado");
    }
}
