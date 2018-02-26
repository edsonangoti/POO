/*
 * (encapsulamento) Criar uma classe ContaCorrente que possua os seguintes atributos:
 *  nome, senha e saldo. Possui ainda os m�todos cadastrarSenha que recebe uma senha 
 *  como par�metro e altera o atributo senha e o m�todo alterarSenha que recebe como 
 *  par�metro a senha antiga e a nova senha. Ele alterar� o atributo senha apenas se a
 *  senha antiga for a correta. Os m�todos debitar e creditar tamb�m dever�o ser implementados,
 *  eles receber�o como par�metro o valor a ser debitado ou creditado e a senha.
 *  Eles s� dever�o efetuar a opera��o caso a senha for correta. Observar o encapsulamento
 *  e escreva um programa de teste para a classe.
 * 
 */
package br.edu.iftm;

public class ContaCorrente {
	private String nome, senha;
	private double saldo;
	
	public ContaCorrente(String nome, String senha, double saldo) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void cadastrarSenha(String senha) {
		this.senha = senha;
	}
	
	public void alterarSenha(String senhaAntiga, String novaSenha) {
		if(senha.equals(senhaAntiga))
			senha = novaSenha;
	}
	
	public void creditar(double valor, String senha) {
		if(this.senha.equals(senha)) {
			saldo+=valor;
		}
	}
	
	public void debitar(double valor, String senha) {
		if(this.senha.equals(senha)) {
			saldo-=valor;
		}
	}
}
