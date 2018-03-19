package estudo.pratica.padroesprojeto.builder;

import java.util.Calendar;

public class TesteBuilderNotaFiscal {

	public static void main(String[] args) {

		NotaFiscal notaFiscal, notaFiscal2;
		BuilderNotaFiscal bnf = new BuilderNotaFiscal();
		BuilderNotaFiscal bnf2 = new BuilderNotaFiscal();

		notaFiscal = bnf.paraNotafiscal("Front-end services")
		.comCNPJ("123")
		.comRazaoSocial("razao social")
		.comDataEmissao(Calendar.getInstance())
		.comObservacoes("obs")
		.comItem(new ItemDaNota("lapis", 12.0))
		.comItem(new ItemDaNota("caneta", 10.0))
		.constroi();
		
		notaFiscal2 = bnf2.paraNotafiscal("SS").comRazaoSocial("Rsd")
				.comCNPJ("4546").comObservacoes("dsfsdf")
				.comDataEmissao(Calendar.getInstance())
				.comItem(new ItemDaNota("papel", 1.00))
				.constroi();
		
		
		System.out.println(notaFiscal);
		System.out.println("-----------------------------");
		System.out.println(notaFiscal2);
	}
}
