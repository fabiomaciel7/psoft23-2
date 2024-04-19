package bridge;
public class EnviaMensagemSlack extends EnviaMensagem {
    public EnviaMensagemSlack(Mensagem mensagem, String destinatario){
        super(mensagem,destinatario);
    }

    @Override
    public void enviarMensagem(){
        System.out.println("Mensagem enviada pelo slack ao destinatario "+ getDestinatario());
    }
}
