
public class Principal {

	public static void main(String[] args) {
		System.out.println();
		gerente g = new gerente();
		g.salvar();
		g.alterar();
		g.cadastrar();
		g.excluir();
		
		iFuncionario func = new gerente();
		
		if(func instanceof gerente){
			func.salvar();
			func.alterar();
			func.excluir();
		}else if (func instanceof Diretor){
			func.excluir();
		}

	}

}
