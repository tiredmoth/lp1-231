package semana05.exercicios;
import java.util.Scanner;
public class EX02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a sua altura, em m:");
        float altura = sc.nextFloat();

        System.out.println("Insira o seu peso, em kg:");
        float peso = sc.nextFloat();

        sc.close();

        float imc = peso/(altura*altura);

        System.out.println("Seu imc é: "+ imc);

        if (imc<18.5) {
            System.out.println("Baixo peso.");
            
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("Peso normal.");

        } else if (imc>=25 && imc<=29.9){
            System.out.println("Excesso de peso.");
            
        } else if (imc>=30 && imc<=34.9){
            System.out.println("Obesidade de Classe 1");
            
        } else if (imc>=35 && imc<=39.9){
            System.out.println("Obesidade de Classe 2");
            
        } else if (imc>=40){
            System.out.println("Obesidade de Classe 3");
            
        } 

        System.out.println("------------STATUS ATUAL---------------");

        float pesoideal= 18.5f*(altura*altura);
        float pesomod= peso-pesoideal;

        if (imc>=18.5 && imc<=24.9) {
            System.out.println("Você não precisa ganhar nem perder peso.");
        } else if (pesomod<=0) {
            System.out.println("Seu peso ideal é: " + pesoideal + " - Você precisa ganhar: " + (-pesomod) + "kg");
        } else if (pesomod>0) {
            System.out.println("Seu peso ideal é: " + pesoideal +" - Você precisa perder:" + pesomod + "kg");
        }
    }
}
