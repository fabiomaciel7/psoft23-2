package bridge;
public class MensagemVoz implements Mensagem {

    @Override
    public void geraMensagem(String conteudo){
        System.out.print("mensagem de voz gerada com conteúdo: " + conteudo);
    }
    
}
