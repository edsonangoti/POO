public class Funcionario {

	private String nome;
	private double horasTrabalhadas, valorDaHora;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorDaHora() {
		return valorDaHora;
	}

	public void setValorDaHora(double valorDaHora) {
		this.valorDaHora = valorDaHora;
	}

	public double calcularSalario() {
		return horasTrabalhadas * valorDaHora;
	}

	public Funcionario(String nome, double valorDaHora, double horasTrabalhadas) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorDaHora = valorDaHora;
	}

}
