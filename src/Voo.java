public class Voo {
    private double DiaVoo;
    private  double horarioVoo;
    private Aviao aviaoo;

    public Voo() {
    }

    public Voo(double DiaVoo, double horarioVoo, Aviao aviaoo) {
        this.DiaVoo = DiaVoo;
        this.horarioVoo = horarioVoo;
        this.aviaoo = aviaoo;
    }


    public double getDiaVoo() {
        return this.DiaVoo;
    }

    public void setDiaVoo(double DiaVoo) {
        this.DiaVoo = DiaVoo;
    }

    public double getHorarioVoo() {
        return this.horarioVoo;
    }

    public void setHorarioVoo(double horarioVoo) {
        this.horarioVoo = horarioVoo;
    }

    public Aviao getAviaoo() {
        return this.aviaoo;
    }

    public void setAviaoo(Aviao aviaoo) {
        this.aviaoo = aviaoo;
    }
   
    
}
