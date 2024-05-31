package laços.enquantoFaça;

/* =============== Fatorial de um número ==================

   - Solicite ao usuário positivo e calcule o fatorial desse número. 
   
   - Importante: O fatorial de um número é o produto de todos os números inteiros positivos. Menores ou iguais a esse número. O fatorial é representado pelo símbolo "!" (exclamação). Por exemplo, lo fatorial de 5 é presentado como 5!. 
    
   A definição formal do fatorial para um número inteiro positivo n é: 

   n! = n x (n-1) x (n-2) x 1
   5! = 5 x 4 x 3 x 2 x 1
   Para n = 0, o fatorial é definido como 1: 

   0!= 1
   
   0!=1 (Por definição, o fatorial de 0 é 1)
1!=1
1!=1
2!=2×1=2
2!=2×1=2
3!=3×2×1=6
3!=3×2×1=6
4!=4×3×2×1=24
5!=5×4×3×2×1=120

 */
import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        int numero; 

        do{
            System.out.println("Digite um número positivo: ");
            numero = porta.nextInt(); 
        }while(numero < 0); 

        int fatorial =1; 

        for(int i = 1; i <= numero; i++){
        fatorial *=i;

        }
            System.out.println("Fatorial de " + numero + " é : " + fatorial);  
    }
}
