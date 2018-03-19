package estudo.pratica.padroesprojeto.observer;

import estudo.pratica.padroesprojeto.builder.NotaFiscal;

public interface AcaoAposEnviarNotaNoBuilder {

	void executa(NotaFiscal nf);
}
