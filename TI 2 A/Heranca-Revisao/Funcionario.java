public class Funcionario {
    private String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void addAumento(double salario){
        this.salario = this.salario + salario;
    }

    public double ganhoAnual(){
        return this.salario * 12;
    }

    public void exibeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }


}
