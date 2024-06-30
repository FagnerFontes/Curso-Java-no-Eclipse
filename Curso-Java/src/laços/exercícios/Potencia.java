package laços.exercícios;

/* =============== Potência ==================

   - Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.
 */
import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
       
       System.out.print("Digite o número para a base: ");
       int base = porta.nextInt();

       System.out.print("Digite o número para o exponte: ");
       int expoente = porta.nextInt(); 
    
        double resultado = 1; 

       for(int i = 0 ; i < expoente ; i++ ){

         resultado *= base; 
        
       }  

       // Exibe o resultado
       System.out.println(base + " elevado a " + expoente + " é: " + resultado);

       //System.out.println(Math.pow(base, base));

    }
}
