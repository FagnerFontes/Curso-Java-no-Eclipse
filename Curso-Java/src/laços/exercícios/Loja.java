package laços.exercícios;

/* =============== Loja ==================

   - O Sr. Manoel Joaquin possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente deve pagar. Eles desenvolveu uma tabela que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de preços, que conterá os preços de 1 até 50 produtos
 */
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        // System.out.println("Quantidade de produtos: ");
        // int quantProdutos = porta.nextInt(); 

        // if(quantProdutos <=0){
        //     System.out.println("A quantidade produtos deve ser maior que 0. ");
        // }

        double preco = 1.99; 
        double valorCompra = 0; 

        System.out.println("Quant.| " + "Valor do Produto");
        System.out.println("=========================");
        for(int i = 1; i <= 50; i++){

            valorCompra = preco * i; 
            System.out.println("  " + i + "   |  R$ " + valorCompra + " reais");
            System.out.println("---------------------------");
        }      
    }
}
