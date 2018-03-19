package estudo.pratica.padroesprojeto.app.banco;

import java.util.ArrayList;
import java.util.List;

import estudo.pratica.padroesprojeto.app.modelo.Conta;

public class FiltroComSaldoMenorQue100 extends Filtro {

    public FiltroComSaldoMenorQue100() {
        super();
    }

    public FiltroComSaldoMenorQue100(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {

        List<Conta> novaListaContas = new ArrayList<Conta>();

        for (Conta conta : contas) {
            if (conta.getSaldo() < 100) {
                novaListaContas.add(conta);
            }
        }

        return novaListaContas;
    }

}
