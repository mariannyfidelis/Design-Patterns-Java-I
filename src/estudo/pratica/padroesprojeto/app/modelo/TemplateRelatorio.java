package estudo.pratica.padroesprojeto.app.modelo;

import java.util.List;

public abstract class TemplateRelatorio {

    public void criaRelatorio(List<Conta> list) {
        cabecalho();
        corpo(list);
        rodape();
    }

    public abstract void cabecalho();

    public abstract void rodape();

    public abstract void corpo(List<Conta> contas);

}
