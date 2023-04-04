package semana06.semana06exs;
public class EX02 {
        public static double calcularIMC(double peso, double altura){
        return peso/(altura*altura);
        }

        public static String classificarIMC(double peso, double altura){

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

    public static double mudarPeso (double peso, double altura){

        double imc= peso/(altura*altura);
        double pesoideal= 18.5*(altura*altura);

        if (imc>=18.5 && imc<=24.9) {
            return 0;
        } else if (peso-pesoideal<=0) {
            return -(peso-pesoideal);
        } else if (peso-pesoideal>0) {
            return peso-pesoideal;
        }
        return 0;
    }
}
