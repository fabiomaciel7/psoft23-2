package state;
public class Publicado implements Estado {

    private Documento doc;

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    @Override
    public void publica() {
        System.out.print("Publicado");
    }
    
}
