package semana21;

public class Retangulo implements Figurageometrica {
    private double lado;
    private double altura;

    public Retangulo(double lado, double altura){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return altura * lado;
    }

    @Override
    public double calcularPerimetro(){
        return lado*2 + altura*2;
    }
}
