package laços.exercícios;

/* =============== Tabuada ==================

   - Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 */
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        System.out.print("Qual tabuada deseja?");
        int tabuada = porta.nextInt(); 

        for(int i = 0; i <= 10; i++){
            int resultado = tabuada * i; 

            System.out.println(tabuada + " x " + i +  " => " + resultado);
        }
       

        
    }
}
