public abstract class Passagem  {
    private int id;
    private int num_passagem;
    private String assento;
    private double dt_viagem;
    private double preco;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_passagem() {
        return this.num_passagem;
    }

    public void setNum_passagem(int num_passagem) {
        this.num_passagem = num_passagem;
    }

    public String getAssento() {
        return this.assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public double getDt_viagem() {
        return this.dt_viagem;
    }

    public void setDt_viagem(double dt_viagem) {
        this.dt_viagem = dt_viagem;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
}
