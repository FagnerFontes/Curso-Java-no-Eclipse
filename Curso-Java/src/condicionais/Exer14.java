package condicionais;

/*
 
	Faça um programa que lê as duas notas parciais obtidas por um aluno numa 
	disciplina ao longo de um semestre, e calcule a sua média. A atribuição 
	de conceitos obedece à tablea abaixo. 

  	* Média de Aproveitamente  Conceito
  	
  	  Entre 9.0 e 10.0 			A
  	  Entre 7.5 e 9.0			B 
  	  Entre 6.0 e 7.5 			C
  	  Entre 4.0 e 6.0 			D
  	  Entre 4.0 e zero 			E 
  	  
  	  O algoritimo deve mostra na tela as notas, a média, o conceito 
  	  correspondente e a mensagem "APROVADO" se o conceito for A, B ou 
  	  "REPROVADO" se o conceito for D ou E.  
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
 
public class Exer14 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = porta.nextDouble();
		
		System.out.print("Digita a segunda nota: ");
		double nota2 = porta.nextDouble(); 
		
		double media = (nota1+nota2)/2; 
		
		
		
		
	}	
}
