package condicionais;

/*
	Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
	descontos são do imposto de renda, que depende do salário bruto (conforme 
	tabela baixo) e 3º para o Sindicato. O Salário Líquido corresponde ao Salário 
	Bruto menos os descontos. O programa deverá pedir ao usuário o valor da 
	sua hora  e quantidade de horas trabalhadas no mês. 
	
	  * Desconte do IR: 
	  * Salário Bruto de até 900 - isento
	  * Salário Bruto de até 1500 - desconto de 5%
	  * Salário Bruto de até 2500 - desconto de 10%
	  * Salário Bruto acima de 2500 - desconto de 20% 
	  * 
	  * Imprima na tela as informações, dispostas conforme o exemplo abaixo.
	  no exemplo o valor da hora é 5 e a quantidade é 220. 
  
  * 
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
 
public class Exer12 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Digite o valor da hora: ");
		double valorHora = porta.nextDouble(); 
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		double quantHoraTrabalhada = porta.nextDouble(); 
		
		double salarioBruto = valorHora *  quantHoraTrabalhada; 
		
		
		
		if(salarioBruto < 900) {
			double IR = 0;
			double descSindicato = salarioBruto * 0.3;
			double INSS = salarioBruto * 0.10; 
			double FGTS = salarioBruto * 0.11; 
			double totalDesconto = IR + INSS + FGTS;
			double salarioLiquido = salarioBruto - IR - INSS - FGTS;
		
			System.out.println("O salário bruto é de: " + salarioBruto);
			System.out.println("IR :" + IR  );
			System.out.println("INSS: " + INSS);
			System.out.println("FGTS: " + FGTS);
			System.out.println("Total de Descontos: " + totalDesconto);
			System.out.println("Salário Líquido: " + salarioLiquido); 
			
		}else if(salarioBruto > 900 && salarioBruto < 1500) {
			
			double IR = salarioBruto * 0.05;
			double descSindicato = salarioBruto * 0.03;
			double INSS = salarioBruto * 0.10; 
			double FGTS = salarioBruto * 0.11; 
			double totalDesconto = IR + INSS + FGTS;
			double salarioLiquido = salarioBruto  - INSS - FGTS;
		
			System.out.println("O salário bruto é de: " + salarioBruto);
			System.out.println("IR :" + IR  );
			System.out.println("INSS: " + INSS);
			System.out.println("FGTS: " + FGTS);
			System.out.println("imposto Sindical: " + descSindicato);
			System.out.println("Total de Descontos: " + totalDesconto);
			System.out.println("Salário Líquido: " + salarioLiquido); 
			
		}else if(salarioBruto > 1500 && salarioBruto < 2500 ){
			
			double IR = salarioBruto * 0.10;
			double descSindicato = salarioBruto * 0.03;
			double INSS = salarioBruto * 0.10; 
			double FGTS = salarioBruto * 0.11; 
			double totalDesconto = IR + INSS + FGTS;
			double salarioLiquido = salarioBruto  - INSS - FGTS;
		
			System.out.println("O salário bruto é de: " + salarioBruto);
			System.out.println("IR :" + IR  );
			System.out.println("INSS: " + INSS);
			System.out.println("FGTS: " + FGTS);
			System.out.println("imposto Sindical: " + descSindicato);
			System.out.println("Total de Descontos: " + totalDesconto);
			System.out.println("Salário Líquido: " + salarioLiquido); 
			
			
		}	
	}	
}
