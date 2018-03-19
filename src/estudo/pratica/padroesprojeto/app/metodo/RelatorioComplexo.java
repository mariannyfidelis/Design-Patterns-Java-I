package estudo.pratica.padroesprojeto.app.metodo;

import java.util.List;

import estudo.pratica.padroesprojeto.app.modelo.Conta;
import estudo.pratica.padroesprojeto.app.modelo.TemplateRelatorio;

public class RelatorioComplexo extends TemplateRelatorio {

    @Override
    public void cabecalho() {
        System.out.println("Banco TestSafer ");
        System.out.println("Endereço ABC SP");
        System.out.println("Telefone (0800-123-456)");
    }

    @Override
    public void rodape() {
        System.out.println("__________________________________________________________________");
        System.out.println("email btestsafer@com.br                            Data 00/00/0000");
    }

    @Override
    public void corpo(List<Conta> list) {

        for (Conta c : list) {
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Titular - " + c.getTitular());
            System.out.println("Saldo   - " + c.getSaldo());
            System.out.println("Agência -");
            System.out.println("Número conta -");
            System.out.println("--------------------------------------------------------\n");
        }
    }
}
