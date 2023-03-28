package semana04.exercicios;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Insira três valores para o cálculo da média:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        sc.close();
        float media= (num1+num2+num3)/3;
        System.out.println("media:" + media);
    }
    
}
