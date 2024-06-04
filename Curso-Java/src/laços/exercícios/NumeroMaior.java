package laços.exercícios;

/* =============== Maior Número ==================

   - Faça um programa que leia 5 números e informe o maior número.

   Para criar um programa em Java que leia 5 número e informe o maior número podemos seuir estes passos: 

   1. Utilizar um objeto "Scanner" ler a entrada do usuário.
   
   2. Inicializar uma variável para amazenar o maior número, 
   inicialmente definida como o menor valor possível. 
   
   3.Usar um loop para ler 5 números do usuário. 

   4. Dentro do loop, comparar cada número lido com o maior número atual e atualizar o maior número se o número atual for maior. 

   5. Após o loop, imprimir o maior número. 
 */
import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        //Inicializa a variável para armazenar o maior número
        int maiorNumero = Integer.MIN_VALUE; //Menor valor possível de um int
         
        int i;
        int num;
        int soma = 0; //é inicializada com 0 para acumular a soma dos números inseridos. 
        int media = 0; //Será calculada após a soma total ser obtida
        //Lopp para ler 5 numeros do usuário
        for(i = 0; i < 5; i++){
            System.out.print("Informe o número : "); 
             num = porta.nextInt();
            soma  += num;
            

            //Verifica se o número atual é o maior que o maior número armazenado
            if(num > maiorNumero){
                maiorNumero = num; 
                
            }    
                
        }
        media = soma/i; 

        System.out.println("A soma do numeros é: " + soma);
      System.out.println("O maior número é : " + maiorNumero);
        String mediadia;
      System.out.println("A media dos numeros digitador é: " + media);
     
       

    }
}
