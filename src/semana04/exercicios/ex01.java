package semana04.exercicios;

import java.util.Scanner;

public class ex01 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor:");
        int num = sc.nextInt();
        int antecessor= num-1;
        int sucessor= num+1;
        System.out.println("o antecessor e sucessor de "  + num + " são: " + antecessor + " e " + sucessor);
    sc.close();

       
    
    }
}
