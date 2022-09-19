package Abstratas;

public class circulo extends Bidimencional{
    private double raio;
    
    //Construtor da classe circulo
    public circulo (double raio){
        this.raio = raio;
    }

    public double area (){
        return 3.14 * Math.pow(raio, 2);
    }
}
