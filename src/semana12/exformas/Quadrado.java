package semana12.exformas;

class Quadrado {
    //Atributos
    public double lado;
    
    public Quadrado(double lado){

        this.lado = lado;

    }

    //Métodos
    public double calcularArea() {
        return lado*lado;
    }

    public double calcularPerimetro (){
        return 4*lado;
    }
}