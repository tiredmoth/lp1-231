package semana11.ex01;

public class Programa {

    public static void main(String[] args){

        //Objeto é uma instância de uma classe

        Aquario aq1 = new Aquario();
        aq1.comprimento = 10.0;
        aq1.altura = 5.0;
        aq1.largura = 8.0;

        System.out.println(aq1.calcularVolume());
        System.out.println(aq1.calcularPotencia(36.0, 28.0));
        System.out.println(aq1.Filtragemmin());
        System.out.println(aq1.Filtragemmax());

    
}
}
