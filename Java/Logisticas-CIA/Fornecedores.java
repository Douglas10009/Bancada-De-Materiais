public class Fornecedores  {
    //nome, endereço, cnpj, telefone, código do fornecedor

    
    private String nome = ""; //Provável vai ter q mudar pq public é "falha" de segurança
    private String endereco = "";
    private int cnpj = 0;
    private int telefone = 0;
    private int cod_fornecedor = 0;

    public Fornecedores (String nome, int cnpj, String endereco, int telefone, int cod_fornecedor){
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.cod_fornecedor = cod_fornecedor;
    }
}
