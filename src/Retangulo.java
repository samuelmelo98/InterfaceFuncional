public class Retangulo {
    private Double a;
    private Double l;


    public Retangulo(Double altura, Double largura){
        this.a = altura;
        this.l =largura;

    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getL() {
        return l;
    }

    public void setL(Double l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "a=" + a +
                ", l=" + l +
                '}';
    }
}
