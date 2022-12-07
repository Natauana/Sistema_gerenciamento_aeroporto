public class Aviao {
    private double carga;
    private int id;
    private String cod_aviao;
    private String cia_aerea;
    private String poutronas;
    private int total_passageiros;

    public Aviao() {
    }

    public double getCarga() {
        return this.carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod_aviao() {
        return this.cod_aviao;
    }

    public void setCod_aviao(String cod_aviao) {
        this.cod_aviao = cod_aviao;
    }

    public String getCia_aerea() {
        return this.cia_aerea;
    }

    public void setCia_aerea(String cia_aerea) {
        this.cia_aerea = cia_aerea;
    }

    public String getPoutronas() {
        return this.poutronas;
    }

    public void setPoutronas(String poutronas) {
        this.poutronas = poutronas;
    }

    public int getTotal_passageiros() {
        return this.total_passageiros;
    }

    public void setTotal_passageiros(int total_passageiros) {
        this.total_passageiros = total_passageiros;
    }
    
}
