import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculadora c = new Calculadora(0,1, "+");
		sc.close();
	}
}
