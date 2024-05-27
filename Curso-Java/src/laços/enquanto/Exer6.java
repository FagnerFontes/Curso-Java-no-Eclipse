package laços.enquanto;

import java.util.Scanner;

/*
======= Números De Dígitos ============ 

    Escreva um programa que peça ao usuário para digitar um número inteiro positivo. O programa deve contar e exibir quantos dígitos esse número possui. 

	Dida: Divida o número por 10 repetidamente até que ele se torne zero, contando quantas divisões são realizadas. 
   
*/
public class Exer6 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in);

		System.out.print("Digite um número inteiro positivo: ");
		int numero = porta.nextInt(); 
		int digitos = 0; 

		while (numero > 0) { 
			numero /= 10; 
			digitos++; 
		}

		System.out.println("O número de digitos: " + digitos);
		porta.close();; 
	}
}
