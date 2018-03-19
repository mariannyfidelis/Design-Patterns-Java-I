package estudo.pratica.padroesprojeto.observer;

import java.util.Calendar;

import estudo.pratica.padroesprojeto.builder.BuilderNotaFiscal;
import estudo.pratica.padroesprojeto.builder.ItemDaNota;
import estudo.pratica.padroesprojeto.builder.NotaFiscal;

public class TestaAcoesAposEnviarNoBuilder {

	public static void main(String[] args) {

		/*
		 * O teste é quase igual ao do Builder, mas a intenção foi implementar um
		 * Observer para ele ....
		 */

		NotaFiscal notaFiscal;
		BuilderNotaFiscal bnf = new BuilderNotaFiscal();

		bnf.paraNotafiscal("Front-end services").comCNPJ("123").comRazaoSocial("razao social")
				.comDataEmissao(Calendar.getInstance()).comObservacoes("obs").comItem(new ItemDaNota("lapis", 12.0))
				.comItem(new ItemDaNota("caneta", 10.0)).comItem(new ItemDaNota("mouse", 8.0));

		bnf.adicionaAcao(new EnviarSMS());
		bnf.adicionaAcao(new EnviarEmail());
		bnf.adicionaAcao(new NotaFiscalDAO());
		bnf.adicionaAcao(new Impressora());
		bnf.adicionaAcao(new Multiplicador(2));

		notaFiscal = bnf.constroi();

		System.out.println(notaFiscal);
	}
}
