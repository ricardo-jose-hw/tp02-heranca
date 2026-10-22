
package model;
import model.IPagamento;
public class PagamentoCartao implements IPagamento {
	public double pagamento;
	public String usuario;
	public String numeroCartao;
	public PagamentoCartao(String user, String card, double valor) {
		this.usuario = user;
		this.numeroCartao = card;
		this.pagamento = valor;
		
	}
	public void calcularPagamento() {
	this.pagamento = this.pagamento + this.pagamento *0.05;	
	}

	public void emitirRecibo() {
		System.out.println("RECIBO"+ "\n CLIENTE: " + this.usuario + "\n VALOR ORIGINAL: " + this.pagamento);
	}
}
