public class Done implements Estado {


    private UserStorie us;

    @Override
    public void mover() {
        System.out.println("nada acontece");
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
