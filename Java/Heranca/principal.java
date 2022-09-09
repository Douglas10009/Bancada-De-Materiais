package Heranca;

public class principal {
    public static void main(String[] args) {
        figura f = new triangulo(10, 5);
        System.out.println("Área do triâgulo " + f.area());

        f = new circulo(13);
        System.out.println("Área do circulo " + f.area());
        // System.out.println("Raio " + f.raio);

        tridimencional c = new esfera(10);
        System.out.println("Área da esfera " + c.area());
        System.out.println("Volume da esfera " + c.volume());
    }
}
