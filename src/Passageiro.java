public class Passageiro extends Pessoa{

public int codigo_cliente, numero_cartao;
public String passaporte;


    public int getCodigo_cliente() {
        return this.codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public int getNumero_cartao() {
        return this.numero_cartao;
    }

    public void setNumero_cartao(int numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public String getPassaporte() {
        return this.passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }


    public Passageiro() {
    }

    public Passageiro(int codigo_cliente, int numero_cartao, String passaporte) {
        this.codigo_cliente = codigo_cliente;
        this.numero_cartao = numero_cartao;
        this.passaporte = passaporte;
    }
    
}