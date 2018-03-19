package estudo.pratica.padroesprojeto.app.modelo;

class RespostaEmXml implements Resposta {

    private Resposta outraResposta;

    /* Exercicio passando a proxima resposta pelo construtor
	  * public RespostaEmXml(Resposta outraResposta) {
	        this.outraResposta = outraResposta;
      }
     */
    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.XML) {
            System.out.println("<conta><titular>" + conta.getTitular()
                    + "</titular><saldo>" + conta.getSaldo()
                    + "</saldo></conta>");
        } else {
            outraResposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;
    }
}
