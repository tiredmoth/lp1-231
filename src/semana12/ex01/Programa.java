package semana12.ex01;

public class Programa {
    public static void main(String[] args){

        //Objeto é uma instância de uma classe

        Aquario aq1 = new Aquario(10.0, 5.0, 8.0);
        Aquario aq2 = new Aquario(10.0);

        System.out.println(aq1.calcularVolume());
        System.out.println(aq1.calcularPotencia(36.0, 28.0));
        System.out.println(aq1.Filtragemmin());
        System.out.println(aq1.Filtragemmax());

        System.out.println(aq2.calcularVolume());
        System.out.println(aq2.calcularPotencia(36.0, 28.0));
        System.out.println(aq2.Filtragemmin());
        System.out.println(aq2.Filtragemmax());

    
}
}
