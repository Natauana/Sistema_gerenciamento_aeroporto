public class Aeroporto{
    private String nomeAeroprto;
    private String codAeroporto;
    private int telefoneAeroporto;
    private Voo vo1;

    public Aeroporto() {
    }

    public Aeroporto(String nomeAeroprto, String codAeroporto, int telefoneAeroporto, Voo vo1) {
        this.nomeAeroprto = nomeAeroprto;
        this.codAeroporto = codAeroporto;
        this.telefoneAeroporto = telefoneAeroporto;
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

    public Voo getVo1() {
        return this.vo1;
    }

    public void setVo1(Voo vo1) {
        this.vo1 = vo1;
    }
   
    
}
 