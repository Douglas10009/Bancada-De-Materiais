public class Conta{
    private double saldo;
    private int tipo; //0 - para corrente e 1 - para polpança
    private int agencia;
    private double numero;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTipo() {
        if (this.tipo == 0) {
            return "corrente";
        }else if (this.tipo == 1) {
            return "polpança";
        }else{
            return "Inválido";
        }
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void sacar(double saldo){
        this.saldo = this.saldo - saldo;
    }

    public void depositar(double saldo){
        this.saldo = this.saldo + saldo;
    }

    public void transferir(double valor , Conta conta){
        conta.depositar(valor);
        this.saldo = this.saldo - valor;
    }

    
}