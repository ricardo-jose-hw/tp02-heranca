package model;

//

public interface IPagamento {

	void calcularPagamento();

	
	default void emitirRecibo() {
	System.out.println("RECIBO" );
	}


};	
	
	

