package laços.exercícios;

/*Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1. */

 /*Algoritmo 


    1. Solicitar ao usuário um número inteiro. 

    2. Se o número for menor ou igual a 1, exibir que ele não é primo. 

    3. Iniciar um loop de 2 até a raiz quadrada de número. 

    4. Dentro do lopp, verificar se o número é divisível por qualquer um dos valores do loop: 

        * Se encontar um divisor, concluir que o número não é primo e sairdo loop. 

        * Caso contrário, continuar verificando até o o final do lopp. 

    5. Se não encontrar nenhum divisor, concluir que o número não primo e sai do loop. 

    6. Exibir o resultado do usuário. 

 */
import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = porta.nextInt();

        //Verifica se o número é primo
        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            //Verifica a divisibilidade de 2 até a raiz quandrada de "numero". 
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if(numero % i == 0){
                    ehPrimo = false; 
                    break; 
                }
            }
        }

        //Exibe o resultado 
        if (ehPrimo) {
            System.out.println(numero + " É um número primo. ");
        }else{
            System.out.println(numero + " Não é um número primo. "); 
        }
    }
}
