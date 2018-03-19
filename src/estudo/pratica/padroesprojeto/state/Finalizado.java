package estudo.pratica.padroesprojeto.state;

public class Finalizado implements EstadoDoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		System.out.println("não posso aplicar desconto extra ...");
	}

	public void aprova(Orcamento orcamento) {
		System.out.println("não posso aprovar");
		return;
	}

	public void reprovar(Orcamento orcamento) {
		System.out.println("não posso reprovar");
		return;
	}

	public void finalizar(Orcamento orcamento) {
		System.out.println("já estou finalizado ....");
		return;
	}

}
