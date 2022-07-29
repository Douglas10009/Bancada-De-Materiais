public class Assistente extends Funcionario{
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibeDados(){
        super.exibeDados();
        System.out.println("Matrícula: " + this.matricula);
    }

    

}
