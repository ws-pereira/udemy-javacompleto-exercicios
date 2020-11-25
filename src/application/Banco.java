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
			Double valor = sc.nextDouble();
			conta = new Conta(nrConta, nomeTitular, valor);
		}
		else {
			conta = new Conta(nrConta, nomeTitular);
		}
		
		System.out.println("\nDados da Conta:\n"+conta);
		
		// Realizando um depósito
		System.out.print("Entre com depósito - R$ ");
		Double valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println();
		System.out.println("Atualizando dados da conta");
		System.out.println("\nDados da Conta:\n"+conta);
		
		// Realizando um saque
		System.out.print("Valor a sacar - R$ ");
		valor = sc.nextDouble();
		conta.saca(valor);
		System.out.println();
		System.out.println("Atualizando dados da conta");
		System.out.println("\nDados da Conta:\n"+conta);
		
		sc.close();
		
	}

}
