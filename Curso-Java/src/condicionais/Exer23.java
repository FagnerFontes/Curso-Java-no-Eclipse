package condicionais;

/*
	Faça um programa que peça um número e informe é inteiro ou decimaç. 
	Dica: utilize uma função de arrendondamento.  
	   
*/
import java.math.*;
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer23 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Digite um número: ");
		double numero = porta.nextDouble(); 
		
		/*
		 	Math.floor(numero) retorna o maior inteiro menor ou igual a 
		 nmero
		 */
		
		//Verifica se o número é inteiro ou decimal
		if(numero == Math.floor(numero)) {
			System.out.println("Este número é inteiro.");
		}else {
			System.out.println("Este número é decimal.");
		}			
	}
}
