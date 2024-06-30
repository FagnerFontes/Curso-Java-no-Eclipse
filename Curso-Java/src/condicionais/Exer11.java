package condicionais;

/*
  As Organizações Tabajara resolverão dar um aumento de salário dos seus 
  colaboradores e lhe contraram para desenvolver um programa que calculará
  os reajustes. 
  
  * 
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
//Faça um Programa que leia três números 
public class Exer11 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Qual o seu salário?");
		double salarioAtual = porta.nextDouble(); 
		 
		
		if(salarioAtual < 280) {
			double percentoAumento = salarioAtual * 0.20;
			double novoSalario = salarioAtual + percentoAumento;
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("O percentual aplicado foi de 20%");
			System.out.println("O valor do aumento foi de : " + percentoAumento);
			System.out.println("O novo salario é de : " + novoSalario);
			
		}else if(salarioAtual > 280 & salarioAtual< 700 ) {
			double percentoAumento = salarioAtual * 0.15;
			double novoSalario = salarioAtual + percentoAumento;
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("O percentual aplicado foi de 15%");
			System.out.println("O valor do aumento foi de : " + percentoAumento);
			System.out.println("O novo salario é de : " + novoSalario);
		}else if (salarioAtual >= 700 && salarioAtual< 1500) {
			double percentoAumento = salarioAtual * 0.10;
			double novoSalario = salarioAtual + percentoAumento;
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("O percentual aplicado foi de 10%");
			System.out.println("O valor do aumento foi de : " + percentoAumento);
			System.out.println("O novo salario é de : " + novoSalario);
		}else if(salarioAtual > 1500) {
			double percentoAumento = salarioAtual * 0.15;
			double novoSalario = salarioAtual + percentoAumento;
			System.out.println("Salario antes do reajuste: " + salarioAtual);
			System.out.println("O percentual aplicado foi de 5%");
			System.out.println("O valor do aumento foi de : " + percentoAumento);
			System.out.println("O novo salario é de : " + novoSalario);
		}	
	}	
}
