package bridge;
public class MensagemTexto implements Mensagem {

    @Override
    public void geraMensagem(String conteudo){
        System.out.print("mensagem de texto gerada com conteúdo: " + conteudo);
    }
    
}
