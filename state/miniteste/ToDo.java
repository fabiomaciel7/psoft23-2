public class ToDo implements Estado {

    private UserStorie us;

    @Override
    public void mover() {
        Estado estado = new InProgress();
        estado.setUs(this.us);
        this.us.mudaEstado(estado);
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
