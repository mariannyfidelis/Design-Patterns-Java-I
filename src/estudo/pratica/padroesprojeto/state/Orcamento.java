package estudo.pratica.padroesprojeto.state;

public class Orcamento {

	private double valor;
	protected EstadoDoOrcamento estadoAtual;

	public Orcamento() {
		estadoAtual = new EmAprovacao();
	}
	public Orcamento(double valor) {
		estadoAtual = new EmAprovacao();
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public EstadoDoOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
        estadoAtual.aprova(this);
      }

      public void reprova() {
        estadoAtual.reprovar(this);
      }

      public void finaliza() {
        estadoAtual.finalizar(this);
      }
}
