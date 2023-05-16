package semana12.ex01;

public class Aquario {

    double comprimento;
    double altura;
    double largura;

    public Aquario(double comprimento, double altura, double largura){

        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;

    }

    public Aquario(double medida){
        this.comprimento= medida;
        this.altura= medida;
        this.largura= medida;
    }

     //Métodos
     public double calcularVolume(){
        return (comprimento*altura*largura)/1000;
    }
    public double calcularPotencia(double tempdes, double tempamb){
        return ((comprimento*altura*largura)/1000)*(tempdes-tempamb)*0.05;
    }
    public double Filtragemmin(){
        return ((comprimento*altura*largura)/1000)*2;
    }
    public double Filtragemmax(){
        return ((comprimento*altura*largura)/1000)*3;
    }
    
}
