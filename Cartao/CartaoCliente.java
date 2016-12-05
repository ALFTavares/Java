
public class CartaoCliente {
	private long numero;
	private String titular;
	private double pontos;
	
	public long getnumero(){
		return numero;
	}
	
	public String gettitular(){
		return titular;
	}
	
	public double getpontos(){
		return pontos;
	}
	
	public void setnumero(long num){
		this.numero = num;
	}
	
	public void settitular(String titular){
		this.titular = titular;
	}
	
	public void setpontos(double pontos){
		this.pontos = pontos;
	}
	
	public CartaoCliente(){
		
	}
	
	public CartaoCliente(long num, String nome){
		this.numero = num;
		this.titular = titular;
		this.pontos = 0;
	}
	
	public double credito (double valorCompra){
		return pontos = valorCompra + pontos;
	}
	
	public double debito (double valorPremio){
		return pontos = pontos - valorPremio;
	}
	
	public void transferirPontos(CartaoCliente cartaoOrigem){
		pontos += cartaoOrigem.getpontos();
		cartaoOrigem.pontos = 0;
	}
	
	public void mostrarpontos(){
		System.out.println(pontos);
	}
}
