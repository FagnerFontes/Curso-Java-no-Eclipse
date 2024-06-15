package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares
 */
import java.util.Scanner;

public class QuantParesImpares {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);


        int par = 0;
        int impar = 0;  
        int i ; 
        
       for ( i = 0; i < 10; i++) {

           System.out.print("Digite numero: " + (i + 1)  + " =>:  ");
           int numero = porta.nextInt();

           

           if (numero % 2 ==0) {
             // System.out.println("é par"); 
            par++ ; 
              
           }else if(numero % 2 !=0){
            impar++;
           }
          

       }
       System.out.println("=====================");
       System.out.println("Números pares: " + par);
       System.out.println("Números Impares: " + impar);
    }
}
