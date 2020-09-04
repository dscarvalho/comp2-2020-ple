package br.ufrj.dcc.comp2.ple.aula_danilo.exemplos.numeros;

/** Classe para calcular divisores de um número.
 * @author Danilo Carvalho &lt;danilosc@dcc.ufrj.br&gt;
 *
 */
public class Divisores {
    /**
     * Imprime os divisores de um um número dado.
     * <p>
     * Para um número inteiro dado, verifica os valores de 1 até o número 
     * se o valor é divisor de número.
     * </p>
     *
     * @param numero Número do qual os divisores serão calculados.
     * 
     */
    public static void imprimirDivisores(int numero) {
        for(int i=1; i <= numero; i++) {
            if(numero % i == 0) {
                System.out.println(i);
            }
        }
    }
 
    public static void main (String[] args) {
        imprimirDivisores(45);
    }
}
