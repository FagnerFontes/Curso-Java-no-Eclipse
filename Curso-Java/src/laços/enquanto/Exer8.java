package laços.enquanto;

import java.util.Scanner;

/*
=======  ============ 

    Escreva um programa que peça ao usuário para digitar um número inteiro positivo. O programa deve verificar se esse número é primo e exibir uma mensagem informaando o resultado. 
*/
public class Exer8 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in);

		//Solicita uma instância da classe Scanner par ler a entre do usuário
		System.out.println("Digite o número inteiro: ");
porta.nextInt();

		//Lê o número digitado pelo usuário
		int numero = porta.nextInt(); 
		boolean ehPrimo = true; 
		int i = 2; 

		while (i <= numero / 2) {
			if (numero % i == 0) {
				ehPrimo = false; 
				break;
			}

			i++; 
		}

		if (ehPrimo && numero > 1) {
			System.out.println("O número " + numero + "é primo.");
		}else{
			System.out.println("O número " + numero + "não é primo.");
		}		
	}
}
