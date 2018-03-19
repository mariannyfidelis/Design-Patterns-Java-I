package estudo.pratica.padroesprojeto.app.modelo;

import java.util.List;

public class IKCV extends TemplateDeImpostoCondicional {

    public IKCV() {
    }

    public IKCV(Imposto imposto) {
        super(imposto);
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100(orcamento);
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    private boolean temItemMaiorQue100(Orcamento orcamento) {
        boolean bool = false;
        List<Item> lista = orcamento.getItens();

        for (Item item : lista) {
            if (item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }

}
