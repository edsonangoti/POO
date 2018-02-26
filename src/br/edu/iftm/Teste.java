package br.edu.iftm;

class Mae {
	private int x = 12;

	int mostra() {
		return x;
	}
}

class Filha extends Mae {
	int y = 23;

	void bla() {
		System.out.println(mostra() + " " + y);
	}
}

class Neta extends Filha {
	int z = 1;

	void qq() {
		System.out.println(mostra() + " " + y + " " + z);
	}
}

public class Teste {
	public static void main(String[] a) {
		Neta neta = new Neta();
		System.out.println(neta.mostra());
		neta.bla();
		neta.qq();
	}
}
