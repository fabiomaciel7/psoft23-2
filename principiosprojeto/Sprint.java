package principiosprojeto;
public class Sprint {
    
    private Cargo desenvolvedor; 
    private Cargo gerente;
    private Cargo lider;
    
    public void defineEquipe(Gerente g, Lider lider, Dev dev) {
        setGerente(g);
        setLider(lider); 
        setDesenvolvedor(dev);
    }
    
    private void setGerente(Gerente gerente){
        this.gerente = gerente;
    }
    
    private void setLider(Lider lider){
        this.lider = lider;
    }
    
    private void setDesenvolvedor(Dev dev){
        this.desenvolvedor = dev;
    }
}