package br.ufrj.dcc.comp2.ple.aula_danilo.exemplos.excecoes;
import java.util.Scanner;
 
 /** Introduz exceções através de um erro simples de execução.
 * @author Danilo Carvalho &lt;danilosc@dcc.ufrj.br&gt;
 *
 */
public class IntroExcecoes {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua idade e aperte <ENTER>: ");
        String linha = scanner.nextLine();
        idade = Integer.parseInt(linha);
        System.out.println("Sua idade em binário é: " +
                           Integer.toBinaryString(idade));
    }
}