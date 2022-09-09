package Heranca;

public class esfera extends tridimencional {
    private double raio;

    public esfera (double raio){
        this.raio = raio;
    }

    public double volume (){
        return 4/3 * (3.14 * Math.pow(raio, 3));
    }

    public double area (){
        return 4 * 3.14 * Math.pow(raio, 2);
    }
}
