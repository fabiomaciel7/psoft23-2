package state;
public class Rascunho implements Estado {
    
    private Documento doc;

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    @Override
    public void publica() {
        Estado estado = new Revisao();
        estado.setDoc(this.doc);
        this.doc.mudaEstado(estado);
        
    }

}
