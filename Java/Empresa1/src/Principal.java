import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Funcionario func = new Funcionario(); //Segundo funcion�rio � um contrutor
		Scanner sc = new Scanner(System.in);
		//List<Cliente> = new ArrayList<Cliente>();
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite seu endere�o: ");
		String endereco = sc.next();
		
		Funcionario func1 = new Funcionario(nome,endereco);
	}
}
