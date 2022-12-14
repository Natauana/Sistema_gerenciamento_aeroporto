public class Voo {
    private double DiaVoo;
    private  double horarioVoo;
    private double horarioPouso;
    private Aviao aviaoo;

    public Voo(double DiaVoo, double horarioVoo, double horarioPouso, Aviao aviaoo) {
        this.DiaVoo = DiaVoo;
        this.horarioVoo = horarioVoo;
        this.horarioPouso = horarioPouso;
        this.aviaoo = aviaoo;
    }

    public Voo() {
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

    public double getHorarioPouso() {
        return this.horarioPouso;
    }

    public void setHorarioPouso(double horarioPouso) {
        this.horarioPouso = horarioPouso;
    }

    public Aviao getAviaoo() {
        return this.aviaoo;
    }

    public void setAviaoo(Aviao aviaoo) {
        this.aviaoo = aviaoo;
    }

   
    
}
