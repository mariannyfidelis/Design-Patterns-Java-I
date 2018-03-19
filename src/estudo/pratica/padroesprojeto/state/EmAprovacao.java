package estudo.pratica.padroesprojeto.state;

public class EmAprovacao implements EstadoDoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() - orcamento.getValor()*0.05);
	}

	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
		System.out.println(" estou aprovando ...");
		return;
	}

	public void reprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		System.out.println(" estou reprovando ...");
		return;
	}

	public void finalizar(Orcamento orcamento) {
		System.out.println(" não posso finalizar ainda ...");
		return;
	}

}
