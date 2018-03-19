package estudo.pratica.padroesprojeto.app.banco;

import java.util.ArrayList;
import java.util.List;

import estudo.pratica.padroesprojeto.app.modelo.Conta;

public abstract class Filtro {

    protected final Filtro filtro;

    public Filtro() {
        this.filtro = null;
    }

    public Filtro(Filtro outroFiltro) {
        this.filtro = outroFiltro;
    }

    public abstract List<Conta> filtra(List<Conta> contas);
    
    protected List<Conta> proximo(List<Conta> contas){
        if(filtro != null) {
            return filtro.filtra(contas);
        }
        else{
         return new ArrayList<Conta>();
        }
    }
}
