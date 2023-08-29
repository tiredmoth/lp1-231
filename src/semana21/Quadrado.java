package semana21;

public class Quadrado implements Figurageometrica {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public double calcularPerimetro(){
        return lado*4;
    }
}
