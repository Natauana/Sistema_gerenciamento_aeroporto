public class Endereco {
    private int casa_numero;
    private String rua;
    private String bairro;
    private Aeroporto aero;

    public Endereco() {
    }

    public Endereco(int casa_numero, String rua, String bairro, Aeroporto aero) {
        this.casa_numero = casa_numero;
        this.rua = rua;
        this.bairro = bairro;
        this.aero = aero;
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

    public Aeroporto getAero() {
        return this.aero;
    }

    public void setAero(Aeroporto aero) {
        this.aero = aero;
    }
    


}
