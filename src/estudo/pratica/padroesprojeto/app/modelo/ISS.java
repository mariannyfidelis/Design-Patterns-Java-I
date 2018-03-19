package estudo.pratica.padroesprojeto.app.modelo;

public class ISS extends TemplateDeImpostoCondicional {

    public ISS() {
    }

    public ISS(Imposto imposto) {
        super(imposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + this.calculoDoOutroImposto(orcamento);
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
