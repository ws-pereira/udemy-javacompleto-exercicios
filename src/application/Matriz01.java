/* Autor: Wanderson Pereira
 * Fazer uma matriz com N linhas e colunas, sendo todos valores inteiros
 * Apresentar diagonal principal e os a quantidade de valores negativos
 * 
 */
package application;

import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Determinando a mesma quantidade de linhas e colunas
		System.out.print("Digite o tamanho da Matriz - ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		int valoresNegativos = 0;		// Variável para contar valores menor que zero
		
		for(int linha = 0; linha  < n; linha++) {
			for(int coluna = 0; coluna < n; coluna++) {
				
				// Entrada dos valores
				matriz[linha][coluna] = sc.nextInt();
				
				// Contagem dos valores negativos na matriz
				if(matriz[linha][coluna] < 0) {
					valoresNegativos++;
				}
			}
			
		}
		
		// Apresentando diagonal principal
		System.out.println("Diagonal Principal");
		
		
		for(int linha = 0; linha < n; linha++) {
				System.out.print(matriz[linha][linha]+ " ");
		}
		
		
		System.out.println("\nValores negativos - "+valoresNegativos);
		
		sc.close();
		
	}

}
