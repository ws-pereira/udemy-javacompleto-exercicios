/* Autor: Wanderson Pereira
 * Exercício de fixação de vetor
 * Aluguel de 10 quartos para estudando, após apresentar os quartos alugados na ordem por nro
 */

package application;

import java.util.Scanner;

import entities.Quartos;

public class Pensao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Criando vetor com 10 posições vagos
		Quartos[] nrQuartos = new Quartos[10];
		
		// Entrada da quantidade de quartos alugados
		System.out.print("Aluguel - ");
		int aluguelQuartos = sc.nextInt();
		
		// Repetição para entrada de dados
		for(int x = 1; x <= aluguelQuartos; x++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Aluguel #"+x);
			System.out.print("Nome   - ");
			String nome = sc.nextLine();
			System.out.print("Email - ");
			String email = sc.nextLine();
			System.out.print("Nr Quarto - ");
			int nrDoQuarto = sc.nextInt();
			nrQuartos[nrDoQuarto] = new Quartos(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados");
		
		// Repetição para saída dos dados, em ordem do nro do quarto
		for(int x = 0; x < 10; x++) {
			if(nrQuartos[x] != null) {
				System.out.println(x + " : " + nrQuartos[x]);
			}
		}
		
		sc.close();
	}

}
