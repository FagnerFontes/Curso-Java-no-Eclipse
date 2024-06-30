package strings.exercicios;

import java.util.Scanner;

public class exer {

    public static void main(String[] args) {

        Scanner porta = new Scanner(System.in);

        //Declara uma String
        String nome = "Fagner Fontes";

        //Verifica se na String tem um determinado caracter
        boolean verifica = nome.startsWith("F");

    //Imprime o resultado da busca
      System.out.println(verifica);
    }
}
