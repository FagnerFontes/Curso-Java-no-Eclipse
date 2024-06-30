package condicionais;

/*
	Faça um Programa que leia 2 números e em seguida pergunte ao usuário 
	qual operação ele deseja realizar. O resultado da operação deve ser
	acompanhado de uma frase que diga se o número é: 
	
	* par ou ímpar
	* positivo ou negativo; 
	* inteiro ou decimal
*/   
*/
import java.math.*;
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer24 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Digite o primeiro número: ");
		double num1 = porta.nextDouble(); 
		
		System.out.print("Digite o segundo número: ");
		double num2 = porta.nextDouble();
		
		if(num1 == Math.floor(num1)) {}
				
	}
}
