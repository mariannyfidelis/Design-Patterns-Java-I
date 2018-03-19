package estudo.pratica.padroesprojeto.app.modelo;

public class TesteDeImpostos {

    public static void main(String[] args) {

        Imposto iss = new ISS();

        Imposto icms = new ICMS();

        Imposto iss_icms = new ISS(new ICMS());

        Imposto alto = new ImpostoMuitoAlto();
        
        Imposto alto_icms = new ImpostoMuitoAlto(icms);
        
        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(iss.calcula(orcamento));

        System.out.println(icms.calcula(orcamento));

        System.out.println(iss_icms.calcula(orcamento));
        
        System.out.println(alto.calcula(orcamento));
        
        System.out.println(alto_icms.calcula(orcamento));
        
    }
}
