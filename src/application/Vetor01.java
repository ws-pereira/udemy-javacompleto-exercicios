/* Autor: Wanderson Pereira
 * Exercício indicado e resolvido junto com o Professor
 * Ler um número N e N alturas, depois apresentar a média das alturas
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		// Entrada dos dados
		System.out.print("Entre com a quantidade de alturas: ");
		int qtdAlturas = sc.nextInt();
		
		// Criando objeto para o vetor
		Double[] vetor = new Double[qtdAlturas];
		
		// Variável de soma das alturas
		Double somaAlturas = 0.00;
		
		for(int xVetor = 0; xVetor < qtdAlturas; xVetor++) {
			vetor[xVetor] = sc.nextDouble();
			somaAlturas += vetor[xVetor];
		}
		
		Double mediaAlturas = somaAlturas / qtdAlturas;
		System.out.printf("Media das alturas - %.2f" , mediaAlturas);
		sc.close();
	}

}
