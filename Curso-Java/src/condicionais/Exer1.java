package condicionais;

import java.util.Scanner;

//Faça um Programa que um valor mostre na tela se o valor é positivo ou negativo.

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner porta = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int valor =  porta.nextInt();
		
		if(valor > 0) {
		System.out.print("Este é um número positivo");
		}else {
			System.out.print("Este é um valor negativo");
		}
		
			
	}
}
