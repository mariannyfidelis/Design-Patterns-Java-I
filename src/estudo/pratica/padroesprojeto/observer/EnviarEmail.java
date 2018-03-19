package estudo.pratica.padroesprojeto.observer;

import estudo.pratica.padroesprojeto.builder.NotaFiscal;

public class EnviarEmail implements AcaoAposEnviarNotaNoBuilder {

	public void executa(NotaFiscal nf) {

		System.out.println("enviando email ...");
	}

}
