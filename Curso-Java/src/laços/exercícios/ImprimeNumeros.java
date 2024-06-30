package laços.exercícios;

/* =============== Imprimir números de 1 a 20 ==================

   - .
 */
import java.util.Scanner;
import laços.enquanto.Contador;

public class ImprimeNumeros {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        int contador =0; 

        while (contador < 10) { 
            contador++; 
            System.out.print(contador + "-");
        }
        System.out.println("");
        System.out.println("==========================");
        
        
        for(int i = 1 ; i <= 20; i++){
            System.out.print("- " + i);
        }
    }
}
