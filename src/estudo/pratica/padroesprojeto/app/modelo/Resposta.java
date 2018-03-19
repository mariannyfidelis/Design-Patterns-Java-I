package estudo.pratica.padroesprojeto.app.modelo;

interface Resposta {

    void responde(Requisicao req, Conta conta);

    void setProxima(Resposta resposta);
}
