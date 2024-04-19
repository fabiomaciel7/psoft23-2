package bridge;
public class MensagemImagem implements Mensagem {

    @Override
    public void geraMensagem(String conteudo){
        System.out.print("mensagem de imagem gerada com conteúdo: " + conteudo);
    }

}
