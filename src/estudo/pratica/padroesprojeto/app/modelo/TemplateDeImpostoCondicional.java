package modelo;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional() {
    }

    public TemplateDeImpostoCondicional(Imposto imposto){
        super(imposto);
    }
    @Override
    public double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract double minimaTaxacao(Orcamento orcamento);

}
