import java.util.Scanner;
public class UsaContador2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Enter = new Scanner(System.in);
		String enter;
		Contador contador = new Contador(0);
		
		while (contador.getnumeroSenha() < 3){
			System.out.println("Carregue na tecla ENTER para retirar uma senha");
			enter = Enter.nextLine();
			contador.incrementar();
			contador.apresentar();
		}
		System.out.println("Carregue com mais papel");
	}

}
