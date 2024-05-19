import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {

		 Clientes novoCliente = new Clientes();

         Scanner porta = new Scanner(System.in); 

         
       System.out.print("Qual o seu nome ? ");
       String nomeCliente = porta.next();
       
       System.out.println("Qual o numero da conta ?"); 
       int numeroConta = porta.nextInt(); 
       
       //System.out.print("Saldo Atual"); 
       //int saldoAtual = porta.nextInt();
       
       int saldoAtual = 2500; 
      
     
	novoCliente.cliente(nomeCliente, numeroConta, saldoAtual);
      System.out.println("Nome :" + novoCliente.nomeCliente);  
      System.out.println("Número da conta: " + novoCliente.numeroConta);
      System.out.println("O saldo atual da conta é : " + novoCliente.saldoAtual);
      
      
	}

}
