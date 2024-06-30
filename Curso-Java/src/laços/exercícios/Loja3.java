package laços.exercícios;

/* =============== Loja 3 ==================
   - O Sr. Manoel Joaquin expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loga de conveniências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro para o cliente forneceu, para então calcular e mostrar o troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registar a próxima compra.
 */
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Loja3 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        double valorProduto; 
        double totalCompra = 0; 
        int contador = 1; 


        while (true) {
            

            
            do { 
                System.out.print("Insira o valor do produto: ");
                 valorProduto = porta.nextDouble(); 

                 if (valorProduto <= 0) {
                    System.out.println("O valor do produto deve ser maior que zero");

                }

                 System.out.println("================================");

                 
    
                 totalCompra += valorProduto; 
    
            } while ( valorProduto != 0);

            contador++; 
    
            System.out.println("Mercadinho Bem bolado");
            System.out.println("Produto " + contador + " : ");
            System.out.println("Valor total " + totalCompra);
            System.out.println("============================");
    
            System.out.print("Qual valor fornecido pelo cliente?");
            double valorFornecido = porta.nextDouble(); 
            
            double valorTroco = valorFornecido - totalCompra; 
    
            System.out.println("Troco: " + valorTroco);


        }

        
    }
}
