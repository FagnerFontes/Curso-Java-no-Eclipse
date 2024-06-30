package laços.enquantoFaça;

/*
    Faça um programa que leia números do usuário até que um número negativo seja digitado. O programa deve somar todos os números positivos e exibir a soma final. 
*/
import java.util.Scanner; 
public class Exer1 {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in); 
        int soma = 0; 
        int numero; 
        do{
            System.out.println("Digite um número positivo (ou um número negativo para sair): ");
             numero = porta.nextInt();

            if (numero > 0) {
                soma += numero; 
            }

        }while(numero >= 0);
        System.out.println("A soma dos números positivos é : " + soma);
    }
}

