
public class InProgress implements Estado {


    private UserStorie us;

    @Override
    public void mover() {
        if(us.getDev().isSM() ==  false){
            Estado estado = new ToVerify();
            estado.setUs(this.us);
            this.us.mudaEstado(estado);
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
