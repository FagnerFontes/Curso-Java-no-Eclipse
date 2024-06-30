package laços.exercícios;

/* =============== Numero Primo ==================

   - Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

   Problema: Determinar se um número inteiro é primo. 

   1. Decomposição: 

         * Solicitar um número inteiro do usuário. 
   
         * Verificar se o número é menor ou igual a 1 (números menores ou iguais a 1 são primos). 
   
         * Verificar a divisibidade por qualquer inteiro de 2 até a raiz quadrada do número.  
   
         * Se o número for divisível por qualquer um desses inteiros, ele não é primo; caso contrário, ele é primo.

2. Reconhecimento de Padrões

        * Os passos necessários para calcular o menor valor, o maior e a soma dos valores são semelhantes. Em cada iteração, é preciso comparar o número atual com o menor e maior valor conhecidos e acumular a soma. 

        * Implementação: Usar um loop para processar cada número uma vez, comparando e atualizando as variáveis conforme necessário. 

3. Abstração: 

    - Identificar as partes especiais do problema: 

        * Variáveis para armazenar o menor valor ('menor'), o maior valor ('maior') e a ('soma'). 

        * Estrutura de controle para iterar sobre o N números. 
    
    - Detalhes desnecessários: Não é relevante, para a solução, saber de onde os números vêm, apenas que são fornecidos pelo usuário. 

4. Algoritmos: 

    I- Inicializar as variáveis 'menor' com 'Integer.max_value', com 'Integer.MIN_Value' e 'soma' com 0. 

    II- Para cada número fornecido pelo usuário: 

        - Comparar com 'menor' e atualizar 'menor' se o número atual for menor. 

        
        - Comparar com 'maior' e atualizar 'maior' se o número atual for maior. 

        - Somar o número atual à variável 'soma'. 
    
    III- Exibir os valores de 'menor', 'maior' e 'soma'.

 */

 
import java.util.Scanner;

public class MenorValor {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números: ");
        int N = porta.nextInt();
        
        //Verifica se a quantidade números é válida (n > 0)
        if (N <= 0) {
            System.out.print("A quantidade de números deve ser maior que zero. "); 
        }else{
            //Inicializa as variáveis para armazenar o menor, maior e a soma dos valores 

            int menor = Math.min(N, N);  
            int maior = Math.max(N, N);
            int soma = 0; 

            //Lê os N números do usuário
            System.out.print("Digite os " + N + "números: ");
            for(int i = 0; i < N; i++){
                int numero = porta.nextInt(); 

                //Atualiza o menor valor
                if(numero < menor){
                    menor = numero;
                }

                if(numero < menor){
                    maior = numero; 
                }

                //Atualiza a soma dos valores 
                soma += numero; 
            } 

            //Exibe os resultados 
            System.out.println("Menor valor: " + menor);
            System.out.println("Manior valor: " + maior);
            System.out.println("Soma dos valores:" + soma);
        }
       

        
    }
}
