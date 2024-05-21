package AtividadesRealizadas;

public class ClienteModelProva3 { 
	String NotaFiscal;
	String Pedido;
	public ClienteModelProva3() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public ClienteModelProva3(String notaFiscal, String pedido) {
		super();
		NotaFiscal = notaFiscal;
		Pedido = pedido;
	}
	public String getNotaFiscal() {
		return NotaFiscal;
	}
	public void setNotaFiscal(String notaFiscal) {
		NotaFiscal = notaFiscal;
	}
	public String getPedido() {
		return Pedido;
	}
	public void setPedido(String pedido) {
		Pedido = pedido;
	}
	@Override
	public String toString() {
		return "ClienteModelProva3 [NotaFiscal=" + NotaFiscal + ", Pedido=" + Pedido + "]";
	} 
	
	

}
