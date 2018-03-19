package estudo.pratica.padroesprojeto.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String empresa;
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	public String observacoes;

	public NotaFiscal(String empresa, String razaoSocial, String cnpj, Calendar dataDeEmissao, double valorBruto,
			double impostos, List<ItemDaNota> itens, String observacoes) {
		this.empresa = empresa;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getEmpresa() {
		return empresa;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	@Override
	public String toString() {
		String r = "Empresa :" + empresa + "\n" + "Razão social: " + razaoSocial + "\n" + "CNPJ: " + cnpj + "\n"
				+ "Observações: " + observacoes + "\n" + "Data Emissão: " + dataDeEmissao + "\n" + "Valor Bruto: "
				+ valorBruto + "\n" + "Imposto: " + impostos;
		return r;
	}
}
