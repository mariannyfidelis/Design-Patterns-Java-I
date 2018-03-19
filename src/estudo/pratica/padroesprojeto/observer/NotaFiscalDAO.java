package estudo.pratica.padroesprojeto.observer;

import estudo.pratica.padroesprojeto.builder.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposEnviarNotaNoBuilder {

	public void executa(NotaFiscal nf) {
		System.out.println("salvando no banco de dados ...");
	}

}
