package estudo.pratica.padroesprojeto.state;

public class Reprovado implements EstadoDoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		System.out.println("não posso aplicar desconto extra ...");
	}

	public void aprova(Orcamento orcamento) {
		System.out.println("não posso aprovar");
		return;
	}

	public void reprovar(Orcamento orcamento) {
		System.out.println("já estou reprovado ...");
		return;
	}

	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		System.out.println("finalizando ....");
		return;
	}

}
