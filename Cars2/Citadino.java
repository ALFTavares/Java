
public class Citadino extends Carro{
	public Citadino(){
		
	}
	
	public void ligarACManual(){
		System.out.println("AC Ligado");
	}
	
	public void buzinar(){
		super.buzinar();
		System.out.println("Buzina Citadino");
	}
}
