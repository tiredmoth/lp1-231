package semana11.ex01;

public class Aquario {
     //Atributos
     double comprimento;
     double altura;
     double largura;

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
