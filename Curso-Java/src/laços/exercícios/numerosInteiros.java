package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

   - Altere o programa anterior para mostrar no final a soma dos números.
 */
import java.util.Scanner;

public class numerosInteiros {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = porta.nextInt(); 

        System.out.print("Digite o segundo número: ");
        int num2 = porta.nextInt();
        
        int menor = Math.min(num1, num2); 
        int maior = Math.max(num1, num2); 

        int soma = 0;
        int i;  

    //System.out.println("menor número: " + Math.min(num1, num2));
    //System.out.println("maior número: " + Math.max(num1, num2));

    System.out.println("Os numeros compreendidos entre " + menor +  " e " +  maior + " são: " );

   

    for( i = menor +1; i <maior; i++){
        

        System.out.println( i + ".");
        soma +=i; 
    }

    System.out.print("A soma compreendidos entre " + menor + " e " + maior + " é: " + soma);
   

    }
}
