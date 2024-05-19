package condicionais;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner porta = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = porta.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = porta.nextInt();
		
		if(num1 > num2) {
		System.out.println("Este é o maior número digitado: " + num1);
	}else {
		System.out.println("Este é o maior número digitado : " + num2);
		}		
	}
}
