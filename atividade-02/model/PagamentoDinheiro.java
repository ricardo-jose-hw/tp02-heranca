package model;
import model.IPagamento;
public class PagamentoDinheiro implements IPagamento {
	public double pagamento;
	public String usuario;
	public PagamentoDinheiro(String user ,double valor) {
		this.pagamento = valor;
		this.usuario = user;
	}
	
	public void emitirRecibo() {
		System.out.println("RECIBO"+ "\n CLIENTE: " + this.usuario + "\n VALOR ORIGINAL: " + this.pagamento);
	}
	public void calcularPagamento() {
	this.pagamento = this.pagamento - this.pagamento *0.10;	
	}
	
	
}
