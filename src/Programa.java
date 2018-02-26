import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.next();
		System.out.println(nome.toUpperCase());
		String nome2 = teclado.next();
		if(nome.equals(nome2))
			System.out.println("igual");
		else
			System.out.println("diferente");
	}
}
