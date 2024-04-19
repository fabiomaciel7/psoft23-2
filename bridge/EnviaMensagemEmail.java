package bridge;
public class EnviaMensagemEmail extends EnviaMensagem {

    public EnviaMensagemEmail(Mensagem mensagem, String destinatario){
        super(mensagem,destinatario);
    }

    @Override
    public void enviarMensagem(){
        System.out.println("Mensagem enviada por email ao destinatario "+ getDestinatario());
    }
}
