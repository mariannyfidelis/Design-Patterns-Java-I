package estudo.pratica.padroesprojeto.observer;

import estudo.pratica.padroesprojeto.builder.NotaFiscal;

public class Impressora implements AcaoAposEnviarNotaNoBuilder {

	public void executa(NotaFiscal nf) {
		System.out.println("imprimindo ...");
	}
}
