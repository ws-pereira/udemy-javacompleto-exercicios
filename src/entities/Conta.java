/* Seção 09 - Encapsulamento
 * Exercício da aula
 * Autor: Wanderson Pereira
 * Código para criação de objeto de uma conta bancária
 */

package entities;

public class Conta {
	
	private Integer nrConta;
	private String  nomeTitular;
	private Double saldoConta;
	
	public Conta() {
		
	}
	
	

	public Conta(Integer nrConta, String nomeTitular) {
		this.nrConta = nrConta;
		this.nomeTitular = nomeTitular;
		this.saldoConta = 0.00;
	}



	public Conta(Integer nrConta, String nomeTitular, Double saldoConta) {
		this.nrConta = nrConta;
		this.nomeTitular = nomeTitular;
		this.saldoConta = saldoConta;
	}

	public Integer getNrConta() {
		return nrConta;
	}

	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void deposito(Double valor) {
		saldoConta += valor; 
	}
	
	public void saca(Double valor) {
		saldoConta -= valor;
	}
	
	public String toString() {
		return "Conta - " + nrConta
				+", Cliente - " + nomeTitular
				+", Saldo - R$ "+ String.format("%.2f%n",saldoConta);
	}
}
