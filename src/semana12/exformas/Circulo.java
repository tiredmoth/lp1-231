package semana12.exformas;

public class Circulo {
    double raio;
    
    public Circulo(double raio){

        this.raio = raio;

    }

    //Métodos
    public double calcularArea() {
        return Math.PI*(raio*raio);
    }

    public double calcularPerimetro (){
        return 2* Math.PI*raio;
    }
}
