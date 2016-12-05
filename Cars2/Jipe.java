
public class Jipe extends Carro{
	public Jipe(){
		
	}
	
	public void ligarTracao4X4(){
		System.out.println("Tração Ligada!");
	}
	
	public void buzinar(){
		super.buzinar();
		System.out.println("Buzina Jipe");
	}
}
