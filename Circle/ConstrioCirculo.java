
public class ConstrioCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circulo c1 = new Circulo(1.0, 1.0, 5.0);
		Circulo c2 = new Circulo(5.0, 2.0, 3.0);

		System.out.println("perimetro c1: " + c1.perimetro());
		System.out.println("area c1: " + c1.area());
		
		System.out.println("aumentar c1: " + c1.aumentar(2.0));
		
		System.out.println("diminuir c2: " + c2.diminuir(1.5));
		
		System.out.println("perimetro c1: " + c1.perimetro());
		System.out.println("perimetro c2: " + c2.perimetro());
		System.out.println("area c1: " + c1.area());
		System.out.println("area c2: " + c2.area());
		
		c1.comparar(c1.getraio(), c2.getraio());

	}

}
