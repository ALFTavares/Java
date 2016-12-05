
public class UsaCartaoCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CartaoCliente c1 = new CartaoCliente();
		
		c1.setnumero(1234);
		c1.settitular("Antonio");
		
		CartaoCliente c2 = new CartaoCliente(5678, "Ricardo");
		
		c1.credito(45.5);
		
		c1.mostrarpontos();
		c2.mostrarpontos();
		
		c2.transferirPontos(c1);
		
		c1.mostrarpontos();
		c2.mostrarpontos();
		
		c2.debito(20);
		
		c1.mostrarpontos();
		c2.mostrarpontos();

	}

}
