package bridge;
public class EnviaMensagemSMS extends EnviaMensagem {

    public EnviaMensagemSMS(Mensagem mensagem, String destinatario){
        super(mensagem,destinatario);
    }

    @Override
    public void enviarMensagem(){
        System.out.println("Mensagem enviada por SMS ao destinatario "+ getDestinatario());
    }
}
