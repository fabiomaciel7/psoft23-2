package principiosprojeto;
class Dev implements Cargo {
    private String nome;

    public Dev(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
}