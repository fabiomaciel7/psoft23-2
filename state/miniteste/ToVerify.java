
public class ToVerify implements Estado {


    private UserStorie us;

    @Override
    public void mover() {
        if(us.getDev().isSM()){
            if(us.isAprovada()){
                Estado estado = new Done();
                estado.setUs(this.us);
                this.us.mudaEstado(estado);
            }else{
                Estado estado = new ToDo();
                estado.setUs(this.us);
                this.us.mudaEstado(estado);
            }
        }
    }

    @Override
    public void setUs(UserStorie us) {
        this.us = us;
    }

    @Override
    public UserStorie getUs() {
        return this.us;
    }
    

}
