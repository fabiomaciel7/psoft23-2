package principiosprojeto;
class Gerente implements Cargo {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

}