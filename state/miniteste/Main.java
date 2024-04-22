public class Main {
    public static void main(String[] args){
        ScrumBoard scrumBoard = new ScrumBoard();
        Desenvolvedor dev = new Desenvolvedor();
        UserStorie us = new UserStorie(dev);
        scrumBoard.addDev(dev);
        scrumBoard.addUs(us);
        us.mover();
        us.mover();
        dev.tornarSM();
        us.aprovar();
        us.mover();
        us.mover();

    }
}
