package condicionais;

/*
 
	Faça um programa que peça um número correspondente a 
	determinado ano e em seguida informe se este ano é 
	bissexto.   
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
 
public class Exer17 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Infome o ano: ");
		int ano = porta.nextInt(); 
		
		boolean isBissexto = false; 
		
		if(ano % 4 ==0) {
			if(ano % 100 != 0 || ano % 100 == 0); {
				isBissexto = true; 
			}
		}
		
		// Imprime o resultado 
		if(isBissexto) {
			System.out.println(ano + " é um ano bissexto.");
		}else {
			System.out.println(ano + " não é um ano bisexto. ");
		}
		
		
		
		
	}	
}
