package condicionais;

//Faça um Programa que verifique se a letra digita é vogal ou consoante. 

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer4 {

 public static void main(String[] args) {
      
     Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
     
     System.out.print("Digite uma letra.");
     String letra = porta.next().trim().toLowerCase();
     
    	 
    	 if(letra.equalsIgnoreCase ("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.contentEquals("o")  || letra.equalsIgnoreCase("u") ) {
    		 System.out.print("Esta letra é uma vogal");
    	 }else {
     
    	 System.out.print("Esta letra é uma consoante");
     	}
	}
}
