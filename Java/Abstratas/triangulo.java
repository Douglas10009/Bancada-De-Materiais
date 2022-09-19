package Abstratas;

public class triangulo extends Bidimencional {
    private double base, altura;

    //Construtor da classe triângulo
    public triangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //Reescrita da classe area() pai
    @Override
    public double area(){
        return base*altura;
    }
}
