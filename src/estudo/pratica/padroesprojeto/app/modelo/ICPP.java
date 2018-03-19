package estudo.pratica.padroesprojeto.app.modelo;

public class ICPP extends TemplateDeImpostoCondicional {

    public ICPP() {
    }

    public ICPP(Imposto imposto) {
        super(imposto);
    }
    
    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() >= 500;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
