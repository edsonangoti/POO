package um;

public class Circulo {
	private int raio;

	public Circulo(int valor){
		raio=valor;
	}
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		if (raio > 0)
			this.raio = raio;
	}

	double calcularArea() {
		return raio * raio * Math.PI;
	}

	double calcularPerimetro() {
		return 2 * raio * Math.PI;
	}
}
