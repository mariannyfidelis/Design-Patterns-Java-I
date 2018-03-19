package estudo.pratica.padroesprojeto.app.modelo;

class RespostaEmCsv implements Resposta {

    private Resposta outraResposta;

    /* Exercicio passando a proxima resposta pelo construtor
	 * public RespostaEmCsv(Resposta outraResposta) {
        this.outraResposta = outraResposta;
      }*/
    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.CSV) {
            System.out.println(conta.getTitular() + "," + conta.getSaldo());
        } else {
            outraResposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;
    }
}
