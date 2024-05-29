package laços.enquantoFaça;

/* =============== Validação de Entrada ==================

   - Solicite ao usuário números até que ele digite zero. Calcule a média dos números digitados(excluindo o zero). 
 */
import java.util.Scanner;

public class Exer5 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        int  numero; 
        int soma = 0; 
        int contador = 0; 
        do{
            System.out.print("Digite um número positivo: ");
            numero = porta.nextInt(); 

            if (numero != 0) {
                soma += numero;
                contador++; 
            }

        }while( numero != 0);
        if (contador > 0 ) {
            double media = (double) soma / contador; 
            System.out.println("Média dos número: " + media);
        }else{
            System.out.println("Nenhum número foi digitador. ");
        }
        
    }
}
