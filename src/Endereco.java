public class Endereco {
    private int casa_numero;
    private String rua;
    private String bairro;

    public Endereco() {
    }


    public Endereco(int casa_numero, String rua, String bairro) {
        this.casa_numero = casa_numero;
        this.rua = rua;
        this.bairro = bairro;
    }



    public int getCasa_numero() {
        return this.casa_numero;
    }

    public void setCasa_numero(int casa_numero) {
        this.casa_numero = casa_numero;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


}
