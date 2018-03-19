package estudo.pratica.padroesprojeto.state;

public class TestesDoDescontoExtra {

	public static void main(String[] args) {

		Orcamento reforma = new Orcamento(500.0);

		reforma.aplicaDescontoExtra(); // resultado aqui depende da situação corrente do orçamento
		System.out.println("Estado [" +
						reforma.getEstadoAtual().getClass().getSimpleName() 
						+ " ] = " + reforma.getValor());
		
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		System.out.println("Estado [" +
				reforma.getEstadoAtual().getClass().getSimpleName() 
				+ " ] = " + reforma.getValor());
		
		reforma.reprova();
		reforma.aplicaDescontoExtra();
		System.out.println("Estado [" +
				reforma.getEstadoAtual().getClass().getSimpleName() 
				+ " ] = " + reforma.getValor());
		
		reforma.finaliza();
		reforma.aplicaDescontoExtra();
		System.out.println("Estado [" +
				reforma.getEstadoAtual().getClass().getSimpleName() 
				+ " ] = " + reforma.getValor());
	}
}