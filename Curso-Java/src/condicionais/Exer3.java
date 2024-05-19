package condicionais;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo inválido

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer3 {

 public static void main(String[] args) {
     
     // Solicita ao usuário para digitar "M" ou "F"
     System.out.print("Digite M para Masculino ou F para Feminino: ");
     
     Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
     
     // Lê a entrada do usuário, remove espaços em branco e converte para letras minúsculas
     String sexo = porta.next().trim().toLowerCase();
     
     // Verifica a entrada do usuário, ignorando se é maiúscula ou minúscula
     if (sexo.equalsIgnoreCase("M")) {
         System.out.println("Sexo Masculino"); // Imprime "Sexo Masculino" se a entrada for "M" (ignora maiúsculas/minúsculas)
     } else if (sexo.equalsIgnoreCase("F")) {
         System.out.println("Sexo Feminino"); // Imprime "Sexo Feminino" se a entrada for "F" (ignora maiúsculas/minúsculas)
     } else {
         System.out.println("Sexo inválido"); // Imprime "Sexo inválido" para qualquer outra entrada
     }
     
     porta.close(); // Fecha o objeto Scanner após o uso para liberar os recursos
 }
}
