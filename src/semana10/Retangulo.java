package semana10;
class Retangulo {
    //Atributos
    double base;
    double altura;


    //Métodos
    public double calcularArea() {
        return base*altura;
    }

    public double calcularPerimetro (){
        return 2*(base + altura);
    }

}