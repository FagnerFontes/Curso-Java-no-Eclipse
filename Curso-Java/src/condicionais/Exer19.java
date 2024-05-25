package condicionais;

/*
	 Faça um programa que peça uma data no formato dd/mm/aaaa
	 e determine se a mesma é uma data válida. 
	   
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer19 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		
		System.out.print("Informe a data no formato dd/mm/aaaa: ");
		String data = porta.nextLine(); //Solicita ao usuário para inserir a data
		System.out.print("Digite um número menor que 1000:  ");
		int numero = porta.nextInt(); 
		
		if(numero > 100 ) {
			
		}
		
	}	
}




