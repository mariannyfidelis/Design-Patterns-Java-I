package modelo;

import java.util.List;

public class Relatoriosimples extends TemplateRelatorio {

    @Override
    public void cabecalho() {
        System.out.println("Banco TestSafer");
    }

    @Override
    public void rodape() {
        System.out.println("__________________________________________________________________");
        System.out.println("Telefone (0800-123-456)");
    }

    @Override
    public void corpo(List<Conta> list) {
        for (Conta c : list) {
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Titular - " + c.getTitular());
            System.out.println("Saldo   - " + c.getSaldo());
            System.out.println("--------------------------------------------------------\n");
        }
    }
}
