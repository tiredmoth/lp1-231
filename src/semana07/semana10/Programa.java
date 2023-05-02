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

class Quadrado {
    //Atributos
    double lado;


    //Métodos
    public double calcularArea() {
        return lado*lado;
    }

    public double calcularPerimetro (){
        return 4*lado;
    }

}

class Circulo {
    //Atributos
    double raio;


    //Métodos
    public double calcularArea() {
        return Math.PI*(raio*raio);
    }

    public double calcularPerimetro (){
        return 2* Math.PI*raio;
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

        Quadrado quad1 = new Quadrado();
        quad1.lado= 15.0;

        Circulo circ1 = new Circulo();
        circ1.raio=5.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

        System.out.println(quad1.calcularArea());
        System.out.println(quad1.calcularPerimetro());

        System.out.println(circ1.calcularArea());
        System.out.println(circ1.calcularPerimetro());




    }

}
