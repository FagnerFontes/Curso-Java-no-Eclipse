package condicionais;

/*
	 Faça um programa para leitura de 3 notas parciais de um aluno. O 
	 Programa deve calcular a média alcançada por aluno e apresentar: 
	 
	 a. A mensagem "Aprovado", se a média alcançada for maior ou igual a 7, 
	 com a respectiva media alcançada; 
	 
	 b. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva 
	 média alcançada; 
	 
	 c. A mensagem aprovado "Aprovado com Distinção", se a média for igual a 10. 
	   
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer20 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		//Pede que o usuário digite a primeira nota
		System.out.print("Digite a primeira nota: ");
		double nota1 = porta.nextInt(); 
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = porta.nextDouble(); 
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = porta.nextDouble(); 
		
		double media = (nota1 + nota2 + nota3)/3;  
		
		System.out.println("==============================");
		
		if(media == 10) {
		  System.out.println("Aprovado com distinção. Média: " + media); 	
		}else if(media >= 7) {
			System.out.println("Aprovado. Média: " + media);
		}else if(media < 7) {
			System.out.println("Reprovado. Média: " + media);
		}
	}	
}




