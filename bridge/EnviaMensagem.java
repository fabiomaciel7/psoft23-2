package bridge;
public abstract class EnviaMensagem {
    
    private Mensagem mensagem;
    private String destinatario;

    public EnviaMensagem(Mensagem mensagem, String destinatario){
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public void setMensagem(Mensagem mensagem){
        this.mensagem = mensagem;
    }

    public String getDestinatario(){
        return this.destinatario;
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    public void gerarMensagem(String conteudo){
        this.mensagem.geraMensagem(conteudo);
    }

    public abstract void enviarMensagem();

}
