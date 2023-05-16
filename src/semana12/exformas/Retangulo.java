package semana12.exformas;

public class Retangulo {

    double base;
    double altura;
    
    //Construtor
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //Métodos
    public double calcularArea() {
        return base*altura;
    }

    public double calcularPerimetro (){
        return 2*(base + altura);
    }
    
}
