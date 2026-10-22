package view;
import model.PagamentoCartao;
import model.PagamentoDinheiro;
public class Main {

	public static void main(String[] args) {

		PagamentoDinheiro pagamentoDin = new PagamentoDinheiro("Rogério", 50.0);
		PagamentoCartao  pagamentoCard = new PagamentoCartao("Lucrécio", "991920", 90.0);
	}

}
