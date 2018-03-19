package estudo.pratica.padroesprojeto.app.modelo;

public interface Desconto {

    double desconta(Orcamento orcamento);

    void setProximo(Desconto desconto);
}
