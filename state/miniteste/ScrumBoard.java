import java.util.ArrayList;

public class ScrumBoard {
    
    private ArrayList<UserStorie> listaUs;
    private ArrayList<Desenvolvedor> devs;

    public ScrumBoard(){
        listaUs = new ArrayList<UserStorie>();
        devs = new ArrayList<Desenvolvedor>();
    }

    public void addDev(Desenvolvedor dev){
        this.devs.add(dev);
    }

    public void addUs(UserStorie us){
        this.listaUs.add(us);
    }

    public ArrayList<UserStorie> getListaUs() {
        return listaUs;
    }
    public void setListaUs(ArrayList<UserStorie> listaUs) {
        this.listaUs = listaUs;
    }

    public ArrayList<Desenvolvedor> getDevs() {
        return devs;
    }
    public void setDevs(ArrayList<Desenvolvedor> devs) {
        this.devs = devs;
    }

}
