package laços.exercícios;

/* =============== Validação de Entrada ==================

- Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
    
    Para criar um programa em Java que determine o menor valor, o maior valor e a soma de um conjunto de N números fornecido pelo usuário, podemos seguir os seguintes passos: 

    1. Solicitar a quantidade de números (N). 
    2. Ler os N números e armazená-lo. 
    3. Determinar o menor valor, o maior valor e a soma dos valores. 
    4. Exibir resultados. 
 */

 /*
 Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
 */

 
import java.util.Scanner;

public class MenorMaiorValor {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números: ");
        int N = porta.nextInt();

        int i; 
        int media; 
        
        //Verifica se a quantidade números é válida (n > 0)
        if ((N <= 0) || (N > 1000)) {
            System.out.print("A quantidade de números deve ser maior que zero. "); 
        }else{
            //Inicializa as variáveis para armazenar o menor, maior e a soma dos valores 

            int menor = Integer.MAX_VALUE; 
            int maior = Integer.MIN_VALUE;
            int soma = 0; 

            //Lê os N números do usuário
            System.out.print("Digite os " + N + " números: ");
            for( i = 0; i < N; i++){
                int numero = porta.nextInt(); 

                //Atualiza o menor valor
                if(numero < menor){
                    menor = numero;
                }

                if(numero > maior){
                    maior = numero; 
                }

                //Atualiza a soma dos valores 
                soma += numero; 
               
            } 
            media = soma/i;
         

            //Exibe os resultados 
            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
            System.out.println("Soma dos valores:" + soma);
            System.out.println("Media dos valores: " + media);
        }  
    }
}
