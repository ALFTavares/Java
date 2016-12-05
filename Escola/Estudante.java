
public class Estudante {
	String nome;
	String morada;
	int idade;
	double media;
	
	public Estudante(){
		
	}
	
	public Estudante(String n, String m, int i, double med){
		this.nome = n;
		this.morada = m;
		this.idade = i;
		this.media = med;
	}
	
	void PrintEstudante(){
		System.out.println("Nome: " + nome + " morada: " + morada + " idade: " + idade + " media: " +media);
	}
}
