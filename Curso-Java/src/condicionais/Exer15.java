package condicionais;

/*
 	Faça um Programa que peça 3 lados de um triangulo. O programa deverá 
 	informar se os valores podem ser um triângulo. Indique, caso os lados 
 	formem um triângulo, se o mesmo é: 
 	
 	 * Equilatero: três lados iguais; 
 	 * Isosceles: quaisquer dois lados iguais; 
 	 * Escaleno: três lados diferentes
	 
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer15 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Informe o primeiro lado do triângulo: ");
		int lado1 = porta.nextInt();
		
		System.out.print("Informe o segundo lado do triângulo: "); 
		int lado2 = porta.nextInt(); 
		
		System.out.print("Informe o terceiro lado do triângulo: ");
		int lado3 = porta.nextInt();
		
		System.out.println("============================================");
		
		if((lado1 == lado2 && lado1==lado3) && (lado2 == lado1 && lado2 == lado3) && (lado3 == lado1 && lado3 == lado2)) {
			System.out.println("Este é um triângulo Equilatero");
		}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Este é uma triânguglo Isósceles");
		}else if(lado1 != lado2 && lado2 != lado3) {
			System.out.println("Este é um triângulo Escaleno");
		}
	}
}
