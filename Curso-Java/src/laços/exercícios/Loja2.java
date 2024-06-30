package laços.exercícios;

/* =============== Loja 2 ==================

   - O Sr. Manoel Joaquin acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preço de pãoes, de 1 até 50 pães, a partir do preço do pão informado pelo usuário. 
 */
import java.util.Scanner;

public class Loja2 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
         System.out.print("Qual quantidade de pães? ");
        int quantPaes = porta.nextInt(); 

         if(quantPaes <=0){
            System.out.println("A quantidade pães deve ser maior que 0.");
         }

         System.out.print("Qual o valor do pão? ");
         double valorPao = porta.nextDouble(); 
 
        double valorCompra = 0; 

         System.out.println("");

        System.out.println("Quant.| " + "Valor dos pães");
        System.out.println("=========================");
        for(int i = 1; i <= quantPaes; i++){

            valorCompra = valorPao * i; 
            System.out.println("  " + i + "   |  R$ " + valorCompra + " reais");
            System.out.println("---------------------------");
        }      
    }
}
