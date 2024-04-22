public class Desenvolvedor {
    
    private boolean isSM = false;

    public Desenvolvedor(boolean isSM){
        this.isSM = isSM;
    }

    public Desenvolvedor(){

    }

    public void tornarSM(){
        this.isSM = true;
    }

    public boolean isSM() {
        return isSM;
    }

    public void setSM(boolean isSM) {
        this.isSM = isSM;
    }
    

}
