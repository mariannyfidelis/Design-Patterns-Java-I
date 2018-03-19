package estudo.pratica.padroesprojeto.state;

public class Aprovado implements EstadoDoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.02);
	}

	public void aprova(Orcamento orcamento) {
		System.out.println("já estou aprovado");
		return;
	}

	public void reprovar(Orcamento orcamento) {
		System.out.println("não posso reprovar");
		return;
	}

	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		System.out.println("finalizando ...");
		return;
	}

}
