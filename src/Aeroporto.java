public class Aeroporto{
    private String nomeAeroprto;
    private String codAeroporto;
    private int telefoneAeroporto;
    private Voo vo1;
    private Aviao aeronava;

    public Aviao getAeronava() {
        return this.aeronava;
    }

    public void setAeronava(Aviao aeronava) {
        this.aeronava = aeronava;
    }

    public Voo getVo1() {
        return this.vo1;
    }

    public void setVo1(Voo vo1) {
        this.vo1 = vo1;
    }

    public String getNomeAeroprto() {
        return this.nomeAeroprto;
    }

    public void setNomeAeroprto(String nomeAeroprto) {
        this.nomeAeroprto = nomeAeroprto;
    }

    public String getCodAeroporto() {
        return this.codAeroporto;
    }

    public void setCodAeroporto(String codAeroporto) {
        this.codAeroporto = codAeroporto;
    }

    public int getTelefoneAeroporto() {
        return this.telefoneAeroporto;
    }

    public void setTelefoneAeroporto(int telefoneAeroporto) {
        this.telefoneAeroporto = telefoneAeroporto;
    }

    
}
