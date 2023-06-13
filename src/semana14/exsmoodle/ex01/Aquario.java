package semana14.exsmoodle.ex01;

public class Aquario {
    
    double comprimento;
    double altura;
    double largura;

    public Aquario(double comprimento, double altura, double largura){
        this.setComprimento(comprimento);
        this.setAltura(altura);
        this.setLargura(largura);
    }

    public void setComprimento(double comprimento){
        if(comprimento <= 0.0){
            throw new RuntimeException("lado inválido! NOOB");
        }
        this.comprimento = comprimento;
    }

    public void setAltura(double altura){
        if(altura <= 0.0){
            throw new RuntimeException("altura inválida! NOOB");
        }
        this.altura = altura;
    }

    public void setLargura(double largura){
        if(largura <= 0.0){
            throw new RuntimeException("largura inválida! NOOB");
        }
        this.largura = largura;
    }

    

    public double getComprimento(){
        return comprimento;
    }
    
    public double getLargura(){
        return largura;
    }
            
    public double getAltura(){
        return altura;
    }
    


    public double calcularVolume(){
        return ((comprimento * altura * largura) / 1000);
     }
    public double calcularPotenciaDoTermostato(double tempdes, double tempamb){
        return ((comprimento * altura * largura) / 1000) * 0.05 * (tempdes - tempamb);
    }
    public double calcularQuantidadeLitrosFiltro(){
        return ((comprimento * altura * largura) / 1000) * 2;
    }

}