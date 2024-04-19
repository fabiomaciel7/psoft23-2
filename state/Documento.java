package state;
public class Documento {
    
    private Estado estado;

    public Documento(){
        this.estado = new Rascunho();
        this.estado.setDoc(this);
    }

    public void publica(){
        this.estado.publica();
    }

    public void mudaEstado(Estado estado){
        this.estado = estado;
    }

}
