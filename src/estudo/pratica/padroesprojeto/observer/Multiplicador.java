package estudo.pratica.padroesprojeto.observer;

import estudo.pratica.padroesprojeto.builder.NotaFiscal;

public class Multiplicador implements AcaoAposEnviarNotaNoBuilder {

	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	public void executa(NotaFiscal nf) {

		System.out.println("imprimindo multiplicador ... " + nf.getValorBruto() * fator);
	}
}