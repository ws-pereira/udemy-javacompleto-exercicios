/* Autor: Wanderson Pereira
 * Entrar com dois inteiros, para criação de uma matrix. Entrar com os dados da matriz e 
 * escolher um nro, para apresentar os valores à esquerda, acima, à direita e abaixo de X
 */
package application;

import java.util.Scanner;

public class Matriz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Lendo tamanho da matriz
		System.out.print("Digite o tamanho da matriz");
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		// Criando a matriz
		int[][] matriz = new int[linha][coluna];
		
		System.out.println("\nDigite os dados da matriz");
		for(int lin = 0; lin < linha; lin++) {
			for(int col = 0; col < coluna; col++) {
				matriz[lin][col] = sc.nextInt();
			}
		}
		
		// Escolha do nro
		System.out.print("Digite um nro da matriz: ");
		int nro = sc.nextInt();
		
		// Buscando os nros de acordo com sua posição
		for(int lin = 0; lin < linha; lin++) {
			for(int col = 0; col < coluna; col++) {
				if (matriz[lin][col] == nro) {
					System.out.println("\nPosição - " + lin + "," + col + ":");
					
					if(col > 0) {
						System.out.println("Esquerda - "+matriz[lin][col-1]);
						
						if (lin > 0) {
							System.out.println("Acima - "+ matriz[lin-1][col]);
						}
						
						if(col < matriz[lin].length-1) {
							System.out.println("Direita - "+ matriz[lin][col+1]);
						}
						if(lin < matriz[lin].length) {
							System.out.println("Abaixo - "+ matriz[lin+1][col]);
						}
					}
				}
			}
		}
		sc.close();
	}

}
