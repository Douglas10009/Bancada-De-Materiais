package HerancaRevisao;

public class Administrativo extends Assistente{
    double SalarioBonus;
    public void salarioBonus(){
        SalarioBonus = super.salario + (super.salario * 40/100); //O bonûs vai ser de 40%
        System.out.println("Salário com bônus: " + SalarioBonus);
    }
}
