package condicionais;

/*
	
	   
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer22 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

		// Pede que o usuário digite um valor 
		System.out.print("Digite um número: ");
		int numero = porta.nextInt(); 
		
		if(numero % 2 == 0) {
			System.out.println("Este é um número par");
		}else {
			System.out.println("Este é um número impar");
		}
		
	}
}
