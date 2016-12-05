
public class UsaContador1 {

	
	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		contador.setnumeroSenha(0);
		
		contador.incrementar();
		contador.incrementar();
		
		contador.apresentar();
		
		contador.decrementar();
		
		contador.apresentar();
	}

}
