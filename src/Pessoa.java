public abstract class Pessoa {

    private int id_pessoa, cpf;
    private String nome;
    private Endereco end;
    

    public Pessoa() {
    }


    public Pessoa(int id_pessoa, int cpf, String nome, Endereco end) {
        this.id_pessoa = id_pessoa;
        this.cpf = cpf;
        this.nome = nome;
        this.end = end;
    }


    public int getId_pessoa() {
        return this.id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }


    public Endereco getEnd() {
        return this.end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }


    @Override
    public String toString() {
        return "{" +
            " id_pessoa='" + getId_pessoa() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", nome='" + getNome() + "'" +
            ", end='" + getEnd() + "'" +
            "}";
    }


    
}
