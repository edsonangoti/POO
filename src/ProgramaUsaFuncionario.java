public class ProgramaUsaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("João",3.5,20);
		Funcionario f2 = new Funcionario("Mateus",5.5,40);
		Funcionario f3 = new Funcionario("Lucas",13.5,40);
		System.out.println(f1.getNome() + " - " + f1.calcularSalario());
		System.out.println(f2.getNome() + " - " + f2.calcularSalario());
		System.out.println(f3.getNome() + " - " + f3.calcularSalario());
		
	}
}
