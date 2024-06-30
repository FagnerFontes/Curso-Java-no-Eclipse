package laços.exercícios;

/* =============== Eleição ==================

   - Numa uma eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato. 
 */
import java.util.Scanner;
import javax.print.attribute.standard.MediaSize;

public class Eleicao {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        System.out.print("Insira a quantidade eleitores: ");
        int NumEleitores = porta.nextInt(); 

        int candidato1 = 0; 
        int candidato2 = 0; 
        int candidato3 = 0;
        
        System.out.println("Escolha o seu candidato. ");

        System.out.println("candidato1 = 1");
        System.out.println("candidato2 = 2");
        System.out.println("candidato3 = 3");

        for (int i = 1; i <= NumEleitores; i++)  {

            System.out.print("Escolha o seu candidato. ");
            int voto = porta.nextInt();


            if (voto == 1) {
                candidato1++; 
            }else if(voto == 2){
                candidato2++; 
            } else if(voto == 3) {
                candidato3++;
           }

        }

        System.out.println("Total de votos do candidato 1: " + candidato1 + " voto(s)");
        System.out.println("Total de votos do candidato 2: " + candidato2 + " voto(s)");
         System.out.println("Total de votos do candidato 3: " + candidato3 + " voto(s)");
    }
}
