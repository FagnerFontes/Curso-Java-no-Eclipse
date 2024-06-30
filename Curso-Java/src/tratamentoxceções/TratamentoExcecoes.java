package tratamentoxceções;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TratamentoExcecoes {
    
    public static void main(String[] args){

        //Tenta abrir e ler um arquivo
        try {
            //Tenta criar um FileReader para o arquivo "arquivo.text" 
            FileReader file = new FileReader("Aquivo.text"); 

            //Criar um BufferredReader para ler o conteúdo do arquivo
            BufferedReader fileInput = new BufferedReader(file);

            //Lê e imprime a primeira linha do arquivo
            System.out.println(fileInput.readLine());

            //Fecha o BufferredReader
            fileInput.close();

        } catch (FileNotFoundException e) {
            //Captura a exceção se o arquivo não for encontrado
            System.out.println("Arquivo não encontrado: " + e);
        }catch(IOException e){
            //Captura a exceção se ocorrer um erro de leitura
            System.out.println("Erro de leitura: " + e);
        }finally{
            //Bloco que sempre é executado
            System.out.println("Operação de leitura finalizada.");
        }

        //Exemplo de exceção não verificada
        try {
            //Declara duas variáveis inteiras, a e b
            int a = 30, b = 0;
            
            //Tenta dividir ra por b, o que causará uma AritimeticException
            int c = a / b; //Insto causará AritmeticException

            //Imprime o resultado da divisão
            System.out.println("Resultado: " + c);
        } catch (ArithmeticException e) {
            //Captura a exceção de divisão por zero
            System.out.println("Não dividir por zero: " + e);
        } finally{
            //Bloco que sempre é executado
            System.out.println(".Operação de divisão finalizada.");
        }
    }
}
