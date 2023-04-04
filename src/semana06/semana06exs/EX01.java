package semana06.semana06exs;
public class EX01 {
    public static double calcularVolume(double comprimento, double altura, double largura){
        return (comprimento*altura*largura)/1000;
    }
    public static double calcularPotencia(double comprimento, double altura, double largura, double tempdes, double tempamb){
        return ((comprimento*altura*largura)/1000)*(tempdes-tempamb)*0.05;
    }
    public static double Filtragemmin(double comprimento, double altura, double largura){
        return ((comprimento*altura*largura)/1000)*2;
    }
    public static double Filtragemmax(double comprimento, double altura, double largura){
        return ((comprimento*altura*largura)/1000)*3;
    }
}