package laços.enquantoFaça;

/* =============== Menu Opções ==================
   - Crie um menu de opções que permita ao usuário escolher diferentes operações (Ex.: soma, subtração, multiplicação, divisão) até que ele escolha a opção de sair
*/
import java.util.Scanner; 
public class Exer2 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in); 

        int opção; 

        do{
            System.out.println("Escolha uma opção> ");
            System.out.println("Menu");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Sair");
           
            opção = porta.nextInt(); 

            switch (opção) {
                case 1 :
                    System.out.println("Você escolheu somar. ");
                    //Implementar somar
                    break;
                case 2: 
                    System.out.println("Você escolheu subtrair. ");
                    break; 
                case 3: 
                    System.out.println("Você escolheu multiplicar. ");
                    break; 
                case 4: 
                    System.err.println("Você escolheu dividir");
                    break; 
                case 5: 
                System.out.println("Saindo...");
                break;
            default:
                    System.out.println("Opção inválida. Tente novamente");
            }
        }while(opção !=5);
    
    }
}

