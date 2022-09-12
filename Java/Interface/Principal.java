
public class Principal {

	public static void main(String[] args) {
		System.out.println();
		gerente g = new gerente();
		g.salvar();
		g.alterar();
		g.cadastrar();
		g.excluir();
		
		Ifuncionario func = new Gerente();
		
		if(func instanceof Gerente){
			func.salvar();
			func.alterar();
			func.excluir()
		}else if (func. instanceof Diretor){
			func.excluir();
		}

	}

}
