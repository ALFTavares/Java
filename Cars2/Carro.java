
public class Carro {
	String matricula;
	double velocidadeActual = 0;
	double velocidadeMaxima = 200;
	
	Condutor condutor;
	
	public Carro(){
	}
	
	public void ligar(){
		System.out.println("VRUUmmmmmmmmmmmmm");
	}
	
	public void desligar(){
		System.out.println("MMMmmmmmmmmmmmmmm");
	}
	
	public void acelerar(){
		velocidadeActual = (velocidadeActual + 10) + (0.10 * condutor.destreza);
		
		if (velocidadeActual > velocidadeMaxima)
			velocidadeActual = velocidadeMaxima;
	}
	
	public void travar(double intensidadeTravagem){
		if (intensidadeTravagem > velocidadeMaxima)
			intensidadeTravagem = velocidadeMaxima;
		else if (intensidadeTravagem < 0)
			intensidadeTravagem = 0;
		velocidadeActual -= intensidadeTravagem;
		
		if (velocidadeActual > velocidadeMaxima)
			velocidadeActual = velocidadeMaxima;
		else if (velocidadeActual < 0)
			velocidadeActual = 0.0f;
	}
	
	public void buzinar(){
		System.out.println("Buzina de carro");
	}
}
