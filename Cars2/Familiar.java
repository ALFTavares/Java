
public class Familiar extends Carro{
	public Familiar(){
		
	}
	
	public void desligarAirbagPassageiro(){
		System.out.println("Airbag Desligado");
	}
	
	public void buzinar(){
		super.buzinar();
		System.out.println("Buzina Familiar");
	}
}
