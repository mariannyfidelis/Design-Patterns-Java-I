package estudo.pratica.padroesprojeto.state;

public interface EstadoDoOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	void aprova(Orcamento orcamento);
	void reprovar(Orcamento orcamento);
	void finalizar(Orcamento orcamento);
}
