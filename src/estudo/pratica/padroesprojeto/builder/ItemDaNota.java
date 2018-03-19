package estudo.pratica.padroesprojeto.builder;

public class ItemDaNota {

	private String item;
	private double valor;

	public ItemDaNota(String item, double valor) {
		this.item = item;
		this.valor = valor;
	}

	public String getItem() {
		return item;
	}

	public double getValor() {
		return valor;
	}
}
