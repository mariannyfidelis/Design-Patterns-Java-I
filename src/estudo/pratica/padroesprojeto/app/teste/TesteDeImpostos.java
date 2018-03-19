package estudo.pratica.padroesprojeto.app.teste;

import estudo.pratica.padroesprojeto.app.modelo.CalculadorDeImpostos;
import estudo.pratica.padroesprojeto.app.modelo.ICMS;
import estudo.pratica.padroesprojeto.app.modelo.ISS;
import estudo.pratica.padroesprojeto.app.modelo.Imposto;
import estudo.pratica.padroesprojeto.app.modelo.ImpostoMuitoAlto;
import estudo.pratica.padroesprojeto.app.modelo.Orcamento;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

                
        // Calculando o ISS
        calculador.realizaCalculo(orcamento, iss);

        // Calculando o ICMS
        calculador.realizaCalculo(orcamento, icms);
    }
}
