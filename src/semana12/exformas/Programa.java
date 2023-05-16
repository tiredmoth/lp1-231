package semana12.exformas;

public class Programa {
    public static void main(String[] args){

        Quadrado quad1 = new Quadrado(10.0);

        Retangulo ret1 = new Retangulo(10.0, 5.0);
        Retangulo ret2 = new Retangulo(13.0, 3.0);

        Circulo circ1 = new Circulo(8.0);

        System.out.println(quad1.calcularArea());
        System.out.println(quad1.calcularPerimetro());

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());


        System.out.println(circ1.calcularArea());
        System.out.println(circ1.calcularPerimetro());
   }
    
}

