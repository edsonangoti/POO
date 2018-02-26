/*
 * (encapsulamento) Criar uma classe ContaCorrente que possua os seguintes atributos:
 *  nome, senha e saldo. Possui ainda os métodos cadastrarSenha que recebe uma senha 
 *  como parâmetro e altera o atributo senha e o método alterarSenha que recebe como 
 *  parâmetro a senha antiga e a nova senha. Ele alterará o atributo senha apenas se a
 *  senha antiga for a correta. Os métodos debitar e creditar também deverão ser implementados,
 *  eles receberão como parâmetro o valor a ser debitado ou creditado e a senha.
 *  Eles só deverão efetuar a operação caso a senha for correta. Observar o encapsulamento
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
