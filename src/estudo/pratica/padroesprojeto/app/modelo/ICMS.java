package estudo.pratica.padroesprojeto.app.modelo;

import java.util.Random;

public class ICMS extends TemplateDeImpostoCondicional {

    public ICMS() {
    }

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        
        if(deveUsarMaximaTaxacao(orcamento)){
           return maximaTaxacao(orcamento);
        }else{
            return minimaTaxacao(orcamento);
        }
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        Random r = new Random();
        int valor = r.nextInt(1);
        
        if (valor > 0.5) {
            return true;
        }
        return false;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + 50 + this.calculoDoOutroImposto(orcamento);
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + 50 + this.calculoDoOutroImposto(orcamento);
    }

}
