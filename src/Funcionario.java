
public class Funcionario extends Pessoa {

    private Double horas_trabalho;
    private Agencia agencia;

    public Funcionario(Double horas_trabalho, Agencia agencia) {
        this.horas_trabalho = horas_trabalho;
        this.agencia = agencia;
    }


    public Funcionario() {
    }


    public Double getHoras_trabalho() {
        return this.horas_trabalho;
    }

    public void setHoras_trabalho(Double horas_trabalho) {
        this.horas_trabalho = horas_trabalho;
    }

    public Agencia getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

   

   
}
