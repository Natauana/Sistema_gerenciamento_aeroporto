public class Agencia {
    private String nomeAgencia;
    private int codAgencia;
    private Passagem pass;

    public Passagem getPass() {
        return this.pass;
    }

    public void setPass(Passagem pass) {
        this.pass = pass;
    }

    public Agencia(String nomeAgencia, int codAgencia) {
        this.nomeAgencia = nomeAgencia;
        this.codAgencia = codAgencia;
    }

    public Agencia() {
    }

    public String getNomeAgencia() {
        return this.nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public int getCodAgencia() {
        return this.codAgencia;
    }

    public void setCodAgencia(int codAgencia) {
        this.codAgencia = codAgencia;
    }

    
}
