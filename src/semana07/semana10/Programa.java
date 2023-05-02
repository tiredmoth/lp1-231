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

public class Programa{
    public static void main(String[] args){

        //Objeto é uma instância de uma classe

        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 100.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());




    }

}
