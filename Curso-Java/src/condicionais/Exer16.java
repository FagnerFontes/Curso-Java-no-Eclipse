package condicionais;

/*
 	Faça um programa que calcule as raízes de uma operação do segundo grau, na 
 	forma: 
 	
 	ax2 + bx + c
 	
 	 O programa deverá pedir os valores de a b e c e fazer as consistências, 
 	 informando ao usuário nas seguintes situações: 
 	 
 	 a. Se o usuário informar o valor de A igual a zero, a equação não é do 
 	 segundo grau  e o programa não deve pedir os demais valores, sendo 
 	 encerrado.
 	 
 	 b. Se o delta for calculado  for negativo, a equação não possui
	raízes reais. Informe ao usuário e encerre o programa. 
	
	 c. Se o delta calculado for igual a zero a equação possui apenas uma rais 
	 real; informe-a ao usuário; 
	 
	 d. Se o delta for positivo, a equação possui possui duas raiz reais;
	 informe-a ao usuário. 
	 
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer16 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Insira o valor de A: ");
		double valorA = porta.nextDouble(); 
		
		//Verifica se o valor de a é zero
		if(valorA == 0) {
			System.out.println("A equação não é de segundo grau (a = 0) Programa encerrado.)");
		}
		
		System.out.print("Insira o valor de B: ");
		double valorB = porta.nextDouble(); 
		
		System.out.print("Insira o valor de C");
		double valorC = porta.nextDouble();
		
		//Calcula o discriminante (Delta)
		double delta = valorB * valorB - 4 *valorA*valorC; 
		
		//Verifica a condição do detal para determinar o tipo de raízes
		
		if(delta < 0) {
			System.out.println("A equação não possui raízes (delta menor que zero). Programa encerrado ");
		}else if(delta == 0){
			double x = -valorB / (2 * valorA);
			System.out.println("A equação possui uma raiz real: x =" + x ); 
		}else {
			// Duas raízes reais e distintas
            double x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
            double x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
		}
	}
}
