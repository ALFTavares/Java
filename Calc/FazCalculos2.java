import java.util.Scanner;
public class FazCalculos2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner valor = new Scanner(System.in);
		double v1, v2;
		
		System.out.println("Insira o primeiro valor :");
		v1 = valor.nextDouble();
		System.out.println("Insira o segundo valor");
		v2 = valor.nextDouble();
		
		System.out.println(calc.soma(v1, v2));
		System.out.println(calc.subtrai(v1, v2));
		System.out.println(calc.mult(v1, v2));
		System.out.println(calc.div(v1, v2));

	}

}
