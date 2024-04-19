package state;
public class Revisao implements Estado {

    private Documento doc;
    
    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    @Override
    public void publica() {
        Estado estado = new Publicado();
        estado.setDoc(this.doc);
        this.doc.mudaEstado(estado);
    }
    
}
