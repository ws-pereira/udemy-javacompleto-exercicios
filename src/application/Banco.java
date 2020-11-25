/* Seção 09 - Encapsulamento
 * Exercício da aula
 * Autor: Wanderson Pereira
 * Codigo para chamada de objetos para o exercicio com base 
 * nas operações básicas de uma conta bancária
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		// Entrada dos dados principais
		System.out.print("Nr. da Conta : ");
		Integer nrConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome Titular : ");
		String nomeTitular = sc.nextLine();
		
		// Condição para validar depósito
		System.out.println();
		
		System.out.print("Haverá depósito inicial (S / N )? ");
		char opDeposito = sc.next().charAt(0);
		if( opDeposito == 'S' || opDeposito == 's') {
			System.out.print("Depósito : R$ ");
			Double deposito = sc.nextDouble();
			conta = new Conta(nrConta, nomeTitular, deposito);
		}
		else {
			conta = new Conta(nrConta, nomeTitular);
		}
		
		System.out.println("\nDados da Conta:\n"+conta);
		
		sc.close();
		
	}

}
