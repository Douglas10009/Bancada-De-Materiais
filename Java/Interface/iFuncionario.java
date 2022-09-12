
public interface iFuncionario {
	public void salvar();
	public void excluir();
	public void alterar();
	public void cadastrar();
	public int calcular (int num);
	
	
	default void teste(){
		
	}
	
}
