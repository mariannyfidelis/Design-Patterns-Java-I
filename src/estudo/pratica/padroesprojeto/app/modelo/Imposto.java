package estudo.pratica.padroesprojeto.app.modelo;

public abstract class Imposto {

    private final Imposto imposto;

    public Imposto() {

        this.imposto = null;
    }

    public Imposto(Imposto outroImposto) {

        this.imposto = outroImposto;
    }

    protected double calculoDoOutroImposto(Orcamento orcamento) {

        if (imposto == null) {
            return 0;
        }

        return imposto.calcula(orcamento);
    }

    protected abstract double calcula(Orcamento orcamento);
}
