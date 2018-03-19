package estudo.pratica.padroesprojeto.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import estudo.pratica.padroesprojeto.observer.AcaoAposEnviarNotaNoBuilder;

public class BuilderNotaFiscal {

	private String empresa;
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens = new ArrayList<>();
	private String observacoes;
	private List<AcaoAposEnviarNotaNoBuilder> todasAcoes;

	public BuilderNotaFiscal(){
		todasAcoes = new ArrayList<>();
	}
	
	public void adicionaAcao(AcaoAposEnviarNotaNoBuilder acao) {
		this.todasAcoes.add(acao);
	}
	
	public BuilderNotaFiscal paraNotafiscal(String string) {
		empresa = string;
		return this;
	}

	public BuilderNotaFiscal comCNPJ(String string) {
		cnpj = string;
		return this;
	}

	public BuilderNotaFiscal comRazaoSocial(String string) {
		razaoSocial = string;
		return this;
	}

	public BuilderNotaFiscal comDataEmissao(Calendar instance) {
		dataDeEmissao = instance;
		return this;
	}

	public BuilderNotaFiscal comObservacoes(String string) {
		observacoes = string;
		return this;
	}

	public BuilderNotaFiscal comItem(ItemDaNota itemDaNota) {

		itens.add(itemDaNota);
		valorBruto += itemDaNota.getValor();
		impostos += itemDaNota.getValor() * 0.05;
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(empresa, razaoSocial, cnpj, dataDeEmissao, valorBruto, impostos, itens,
				observacoes);

		for(AcaoAposEnviarNotaNoBuilder acao : todasAcoes) {
			acao.executa(nf);
		}
		
		return nf;
	}
}
