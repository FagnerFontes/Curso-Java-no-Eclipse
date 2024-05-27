package laços.enquanto;

import java.util.Scanner;

/*
======= Contagem de números ============ 

    Escreva um programa que peça ao usuário para digitar um número positivo. O programa deve contar de 1 até o número fornecido e exibir o número na tela. 

    Dica: Use uma variável contadora que começa em 1 e é incrementada até atingir cada número fornecido. 
   
*/
public class exer3 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in);

		// Inicializa o programa pedindo que o usuário digite um número positivo.
		System.out.print("Digite um número positivo: ");
		int numero = porta.nextInt(); // Recebe número digitado pelo usuário.

		int contador = 1;// Inicializa uma variável chamada "contador" para acumular a soma dos números digitados pelo usuário.

		while (contador <= numero) {//Verifica se o número digitado é menor que o número armazenado no contador. 

			System.out.println("contador: " + contador);//Imprime os números contados
			contador++;//Adiciona + 1 ao contador, a cada verificação efetuada

		}
	}
}
