package br.edu.iftm;

public class ProgramaTesteConta {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente("Edson","123",0.0);
		conta.alterarSenha("123", "456");
		conta.creditar(100.50, "456");
		conta.debitar(400, "123");
		System.out.println(conta.getNome()+"/"+conta.getSaldo());
	}

}
