public class Tecnico extends Assistente {
    double SalarioBonus;
    public void salarioBonus(){
        SalarioBonus = super.salario + (super.salario * 30/100); //O bonûs vai ser de 30%
        System.out.println("Salário com bônus: " + SalarioBonus);
    }

    public double ganhoAnual(){
        return this.SalarioBonus = this.SalarioBonus * 12;
    }

}
