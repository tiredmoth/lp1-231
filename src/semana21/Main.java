package semana21;

//interface = contrato
//conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que implementa a interface

public class Main {
    public static void main(String[] args){
        System.out.println("Main....");

        Quadrado q1 = new Quadrado(10);
        Retangulo r1 = new Retangulo(10, 20);
        Circulo c1 = new Circulo(5);

        Tela tela = new Tela();
        tela.addFigurageometrica(q1);
        tela.addFigurageometrica(r1);
        tela.addFigurageometrica(c1);

        System.out.println(tela.totalArea());
    }
    
}
