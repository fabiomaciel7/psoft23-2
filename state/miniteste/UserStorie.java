public class UserStorie {

    private Estado estado;
    private boolean aprovada = false;
    private Desenvolvedor dev;

    public UserStorie(Desenvolvedor dev){
        this.dev = dev;
        this.estado = new ToDo();
        this.estado.setUs(this);
    }

    public void trocaDev(Desenvolvedor dev){
        this.dev = dev;
    }

    public void mover(){
        this.estado.mover();
    }

    public void mudaEstado(Estado estado){
        this.estado = estado;
    }

    public void aprovar(){
        if(this.dev.isSM()){
            this.aprovada = true;
        }
    }
    
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

    public boolean isAprovada(){
        return this.aprovada;
    }

    public Desenvolvedor getDev() {
        return dev;
    }

}
