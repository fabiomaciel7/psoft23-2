package bridge;
public class Main {
    public static void main(String args[]){
        EnviaMensagem envia =  new EnviaMensagemSMS(new MensagemTexto(),"Fábio");
        envia.gerarMensagem("olá"); 
        envia.enviarMensagem();
        
    }
}
