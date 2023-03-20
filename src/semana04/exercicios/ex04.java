package exercicios;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código:");

        String codigo = sc.nextLine();
        sc.close();

        int valor;
        valor=Integer.parseInt(codigo.substring(2, 6));

        if (codigo.startsWith("BR") && codigo.endsWith("X") && valor >0 && valor <10000 && codigo.length() == 7) {
            System.out.println("O código é válido.");


    }
    else{
        System.out.println("O código é inválido.");
    }
    
}
}
