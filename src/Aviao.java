public class Aviao {
    private double carga;
    private int id;
    private String cod_aviao;
    private String cia_aerea;
    private String poutronas;
    private int poltronas_ocupadas;
    private int poltronas_vazias;

    public Aviao(double carga, int id, String cod_aviao, String cia_aerea, String poutronas, int poltronas_ocupadas, int poltronas_vazias) {
        this.carga = carga;
        this.id = id;
        this.cod_aviao = cod_aviao;
        this.cia_aerea = cia_aerea;
        this.poutronas = poutronas;
        this.poltronas_ocupadas = poltronas_ocupadas;
        this.poltronas_vazias = poltronas_vazias;
    }


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

    public int getPoltronas_ocupadas() {
        return this.poltronas_ocupadas;
    }

    public void setPoltronas_ocupadas(int poltronas_ocupadas) {
        this.poltronas_ocupadas = poltronas_ocupadas;
    }

    public int getPoltronas_vazias() {
        return this.poltronas_vazias;
    }

    public void setPoltronas_vazias(int poltronas_vazias) {
        this.poltronas_vazias = poltronas_vazias;
    }
    
}
