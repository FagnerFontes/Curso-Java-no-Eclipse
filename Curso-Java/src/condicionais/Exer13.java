package condicionais;

/*
Faça um programa que leia um número e exiba o dia correspondente da semana 
(1-domingo, 2-Segunda), se digitar ou valor deve aparecer valor inválido. 


  
  
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
 
public class Exer13 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.println("Digite o dia Semana:");
		int turno = porta.nextInt(); 
		
		
		switch(turno){
			
			case 1: 
				System.out.println("Domingo");
				break;
			case 2:
				
				System.out.println("Segunda-feira");
				break;
				
			case 3: 
				System.out.println("Terceira-feira");
				break; 
				
			case 4: 
				System.out.println("Quarta-feira");
				break; 
				
			case 5: 
				System.out.println("Quinta-feira");
				break; 
			case 6: 
				System.out.println("Sexta-feira");
				break; 
			
			case 7: 
				System.out.println("Sábado");
				break; 
			default: 
				System.out.println("Dia inválido");
				break;
		}
	}	
}
