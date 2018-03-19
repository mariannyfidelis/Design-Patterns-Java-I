package modelo;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {

        List<String> lista = new ArrayList<String>();

        for (Item item : orcamento.getItens()) {

            if (lista.contains(item.getNome())) {
                return true;
            } else {
                lista.add(item.getNome());
            }
        }
        return false;
    }

    public boolean deveUsarMaximaTaxacaoJAVA8(Orcamento orcamento
    ) {
        boolean b = false;

        for (Item item : orcamento.getItens()) {

            if (orcamento.getItens().stream().distinct().count() < orcamento.getItens().stream().count()) {
                b = true;
            }
        }
        return b;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento
    ) {
        return orcamento.getValor() * 0.13 + 100.0;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento
    ) {
        return orcamento.getItens().size() * 0.01;
    }

}
