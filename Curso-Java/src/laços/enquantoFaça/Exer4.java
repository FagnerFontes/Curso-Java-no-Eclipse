package laços.enquantoFaça;

/* =============== Validação de Entrada ==================

   - Solicite ao usuário para digitar uma senha até que a senha correta (1234) seja digitada. 
 */
import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        int senha; 

        

        do{
            System.out.print("Digite a senha correta: ");
        senha = porta.nextInt(); 
            
        }while(senha != 123);
        
        System.out.println("Programa encerrado!!!");
        
    }
}
