
public class Puppy {
	String nome;
	String raca;
	int idade;
	
	public Puppy(){
		
	}
	
	public Puppy(String n, String r){
		this.nome = n;
		this.raca = r;
	}
	
	public Puppy(String n, String r, int i){
		this (n, r);
		this.idade = i; 
	}
	
	void PrintPuppy(){
		System.out.println("Nome: " + nome+ " Raça "+raca+ " idade: " + idade);
	}
	
	void Ladrar(){
		System.out.println("Au au au!!!");
	}
}
