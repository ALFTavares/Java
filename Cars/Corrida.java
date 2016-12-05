
public class Corrida {

	public Corrida(){
		
	}
	
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.matricula = "11-AA-11";
		carro2.matricula = "22-BB-22";
		
		carro2.velocidadeActual = 300;
		
		Condutor condutor1 = new Condutor();
		Condutor condutor2 = new Condutor();
		
		condutor1.nome = "Antonio";
		condutor1.idade = 25;
		condutor1.destreza = 65;
		
		condutor2.nome = "Manuel";
		condutor2.idade = 27;
		condutor2.destreza = 75;
		
		carro1.condutor = condutor1;
		carro2.condutor = condutor2;
		
		carro1.ligar();
		carro2.ligar();
		
		carro1.acelerar();
		carro2.acelerar();
		carro1.acelerar();
		carro2.travar(10);
		carro1.acelerar();
		carro1.acelerar();
		carro1.travar(50);
		carro2.acelerar();
		
		System.out.println("Velocidade do carro 1: " + carro1.velocidadeActual);
		System.out.println("Velocidade do carro 2: " + carro2.velocidadeActual);
		
		carro1.desligar();
		carro2.desligar();
		
		
	}

}
