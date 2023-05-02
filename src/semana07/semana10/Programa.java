package semana07.semana10;

public class Programa {

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
