
public class Contador {
	private int numeroSenha;
	
	public Contador(){
	}
	
	public int getnumeroSenha(){
		return numeroSenha;
	}
	
	public void setnumeroSenha(int senha){
		this.numeroSenha = senha;
	}
	
	public Contador(int numeroSenha){
		this.numeroSenha = numeroSenha;
	}
	
	public void incrementar(){
		numeroSenha += 1;
	}
	
	public void decrementar(){
		numeroSenha -= 1;
	}
	
	public void apresentar(){
		System.out.println(numeroSenha);
	}
}
