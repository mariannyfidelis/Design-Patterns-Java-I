package banco;

import java.util.ArrayList;
import java.util.List;
import modelo.Conta;

public class FiltroComSaldoMaiorQueQuinhentosMil extends Filtro {

    public FiltroComSaldoMaiorQueQuinhentosMil() {
        super();
    }

    public FiltroComSaldoMaiorQueQuinhentosMil(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    public List<Conta> filtra(List<Conta> contas) {
        
        List<Conta> novaListaContas = new ArrayList<Conta>();

        for (Conta conta : contas) {
            if (conta.getSaldo() > 500000) {
                novaListaContas.add(conta);
            }
        }

        return novaListaContas;
    }

}
