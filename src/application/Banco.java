/* Se��o 09 - Encapsulamento
 * Exerc�cio da aula
 * Autor: Wanderson Pereira
 * Codigo para chamada de objetos para o exercicio com base 
 * nas opera��es b�sicas de uma conta banc�ria
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
		
		// Condi��o para validar dep�sito
		System.out.println();
		
		System.out.print("Haver� dep�sito inicial (S / N )? ");
		char opDeposito = sc.next().charAt(0);
		if( opDeposito == 'S' || opDeposito == 's') {
			System.out.print("Dep�sito : R$ ");
			Double valor = sc.nextDouble();
			conta = new Conta(nrConta, nomeTitular, valor);
		}
		else {
			conta = new Conta(nrConta, nomeTitular);
		}
		
		System.out.println("\nDados da Conta:\n"+conta);
		
		// Realizando um dep�sito
		System.out.print("Entre com dep�sito - R$ ");
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
