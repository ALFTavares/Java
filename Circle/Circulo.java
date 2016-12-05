
public class Circulo {
	private double x;
	private double y;
	private double raio;
	
	public double getraio(){
		return raio;
	}
	
	public Circulo(){
		
	}
	
	public Circulo(double x, double y, double raio){
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	public double perimetro(){
		return 2*3.14*raio;
	}
	
	public double area(){
		return 3.14*raio*raio;
	}
	
	public double aumentar(double aumenta){
		return raio=raio+aumenta;
	}
	
	public double diminuir(double reduz){
		return raio=raio-reduz;
	}
	
	public void comparar(double r1, double r2){
		if (r1 < r2)
			System.out.println(r2 + " é maior");
		else if (r1 > r2)
			System.out.println(r1 + " é maior");
		else
			System.out.println(r1 + " é igual a " + r2);
	}
}
