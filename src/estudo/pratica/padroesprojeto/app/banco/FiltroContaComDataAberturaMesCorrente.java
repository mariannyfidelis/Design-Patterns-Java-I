package estudo.pratica.padroesprojeto.app.banco;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import estudo.pratica.padroesprojeto.app.modelo.Conta;

public class FiltroContaComDataAberturaMesCorrente extends Filtro {

    public FiltroContaComDataAberturaMesCorrente() {
        super();
    }

    public FiltroContaComDataAberturaMesCorrente(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public List<Conta> verifica(List<Conta> contas) {
        List<Conta> novaListaContas = new ArrayList<Conta>();

        for (Conta conta : contas) {
            Period periodo = Period.between(conta.getDataAbertura(), LocalDate.now());
            if (periodo.getMonths() == 1) {
                novaListaContas.add(conta);
            }
        }

        return novaListaContas;
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> contas_atualizadas;

        //contas_atualizadas = verifica(contas) + outroF
                
        return contas_atualizadas=null;
    }
}
