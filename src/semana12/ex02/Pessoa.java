package semana12.ex02;

public class Pessoa {

    double altura;
    double peso;

    public Pessoa(double altura, double peso){

        this.peso = peso;
        this.altura = altura;

    }



    public double calcularIMC(){
        return peso/(altura*altura);
        }

    public String getFaixa(){

        double imc= peso/(altura*altura);

        if (imc<18.5) {
            return "Baixo peso";
            
        } else if (imc>=18.5 && imc<=24.9) {
            return "Peso normal";

        } else if (imc>=25 && imc<=29.9){
            return "Excesso de peso";
            
        } else if (imc>=30 && imc<=34.9){
            return "Obesidade de Classe 1";
            
        } else if (imc>=35 && imc<=39.9){
            return "Obesidade de Classe 2";
            
        } else if (imc>=40){
            return "Obesidade de Classe 3";
            
        } 
        return "";
    }

    public String getSituacao (){

        double imc= peso/(altura*altura);
        double pesoideal= 18.5*(altura*altura);

        if (imc>=18.5 && imc<=24.9) {
            return "Normal";
        } else if (peso-pesoideal<=0) {
            return "Ganhar";
        } else if (peso-pesoideal>0) {
            return "Perder";
        }
        return "";
    }
    
}
