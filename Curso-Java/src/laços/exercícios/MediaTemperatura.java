package laços.exercícios;

/* =============== Validação de Entrada ==================

   - O departamente Estadual de Meterologia lhe contratou para desenvolver um programa que leia um conjunto indeterminado de temperaturas, e informe ao final a menor e a maio temperatura informadas, bem como a médkia das temperaturas. 
 */
import java.util.Scanner;

public class MediaTemperatura {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        //Declaração das variáveis 
        double temp; // Variável para armazenar a temperatura atual 
        double somaTemp = 0 ; // Variável para armazenar a soma das temperaturas 
        int contador = 0; //Variável para contar o número de temperaturas 

        double mediaTemp = 0; 
        String fim = "s"; 

        //Loop do-while ára as temperaturas
        
        do{
            //Solicita que o usuário informe a temperatura ou digite 'n' para finalizar o programa. 
            System.out.println("Informe a temperatura (ou digite n para sair. )");
            String input = porta.next(); //Lê a entrada do usuário como string. 

            //Verifica se o usuário deseja finalizar a entrada 
            if (input.equalsIgnoreCase(("n"))) {
                break; //Sai do loop se o usuário digitar 'n'. 
            }

            //Tenta converter a entrada para um número, caso contrário, pede nova entrada. 
            
            try{
                temp = Double.parseDouble(input); // Converte a entrada para double
                somaTemp += temp;// Adiciona a temperatura à soma total
                contador++;  //Incrementa o contador de temperaturas inseridas
            }catch(NumberFormatException e){
                // Captura a excerção caso a entrada não seja um número válido. 
                System.out.println("Entrada inválida. Por favor, infome uma temperatura válida");
                continue;
            }
        }while(true); //Continua o loop indefinidamente até que seja interrompido.

        //Calcula e exibe a média das temperaturas, se ouverem entradas válidas. 
        
        //Calcula e exibe a média das temperaturas, se ouverem temperaturas válidas
        if (contador > 0) {
            mediaTemp = somaTemp / contador; //
        }else {
            System.out.println("Nenhuma temperatura válida foi informada.");  // Mensagem se nenhuma temperatura válida foi inserida
        }

        System.out.println("A media " + mediaTemp);
            
    }
}
