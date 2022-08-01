
public class Calculadora {
	public double operando1;
	public double operando2;
	public String operador;
	
	public  Calculadora(double operando1 , double operando2, String operador){
		double resultado = 0;
		if(operador.equals("+")){
			resultado =  operando1 + operando2;
		}else if(operador.equals("-")){
			resultado = operando1 - operando2;
		}else if(operador.equals("*")){
			resultado = operando1 * operando2;
		}else if(operador.equals("/")){
			resultado = operando1 / operando2;
		}
		System.out.println(resultado);
	}
}
