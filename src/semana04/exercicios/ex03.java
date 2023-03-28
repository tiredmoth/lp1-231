package semana04.exercicios;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da compra em reais:");

        float compra = sc.nextFloat();
        float desconto=0f;

        sc.close();
        
        if (compra >= 10 && compra <= 99.99) {
            desconto=compra*0.05f;
            
        } else if (compra >= 100 && compra <= 499.99) {
            desconto=compra*0.1f;
        } else if (compra >= 500){
            desconto=compra*0.15f;
            
        }
        System.out.println("Valor da compra com desconto: "+ (compra-desconto) + " Valor do desconto:"+ desconto);
    }
    
}
