import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o operando 1: ");
		double operando1 = sc.nextDouble();

		System.out.print("Digite o operando 2: ");
		double operando2 = sc.nextDouble();

		System.out.println("Digite o operador: [+ para somar, - para subtrair, * para multiplicar, / para dividir]: ");
		String operador = sc.next();

		System.out.print("O resultado é: ");
		Calculadora c = new Calculadora(0,1, "+");
		sc.close();
	}
}
